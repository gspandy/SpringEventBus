package com.zjp.eventbus;

import com.google.common.eventbus.EventBus;
import org.springframework.transaction.support.TransactionSynchronizationAdapter;

/**
 * Project: SpringEventBus
 * Module Desc:com.zjp.eventbus
 * User: zjprevenge
 * Date: 2017/1/11
 * Time: 9:51
 * 事件提交同步器，用于业务处于事物方法中
 */
public class EventBusTransactionSynchronization<T> extends TransactionSynchronizationAdapter {

    private EventBus eventBus;

    private T event;

    public EventBusTransactionSynchronization(EventBus eventBus, T event) {
        this.eventBus = eventBus;
        this.event = event;
    }

    public EventBus getEventBus() {
        return eventBus;
    }

    public void setEventBus(EventBus eventBus) {
        this.eventBus = eventBus;
    }

    public T getEvent() {
        return event;
    }

    public void setEvent(T event) {
        this.event = event;
    }

    /**
     * 事物执行成功提交事件
     */
    @Override
    public void afterCommit() {
        super.afterCommit();
        eventBus.post(event);
    }
}
