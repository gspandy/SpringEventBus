package com.zjp.eventbus;

import com.google.common.eventbus.EventBus;
import org.springframework.transaction.support.TransactionSynchronizationManager;

/**
 * Project: SpringEventBus
 * Module Desc:com.zjp.eventbus
 * User: zjprevenge
 * Date: 2017/1/11
 * Time: 9:45
 */
public class SpringEventBus extends EventBus implements IEventBus {

    /**
     * 发布事件
     *
     * @param event 事件
     */
    public <T> void publish(T event) {
        //如果事件总线处于事物当中，则事件提交成功后进行提交
        if (TransactionSynchronizationManager.isActualTransactionActive()) {
            TransactionSynchronizationManager.registerSynchronization(
                    new EventBusTransactionSynchronization<T>(this, event));
        } else {
            //未处于事物中，直接提交事件
            super.post(event);
        }
    }

    /**
     * 注册事件监听器
     *
     * @param listener 事件监听器
     */

    public void register(EventListener listener) {
        super.register(listener);
    }
}
