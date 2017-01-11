package com.zjp.eventbus;

/**
 * Project: SpringEventBus
 * Module Desc:com.zjp.eventbus
 * User: zjprevenge
 * Date: 2017/1/11
 * Time: 9:45
 */
public interface IEventBus {

    /**
     * 发布事件
     *
     * @param event 事件
     * @param <T>   事件类型
     */
    <T> void publish(T event);

    /**
     * 注册事件监听器
     *
     * @param listener 事件监听器
     */
    void register(EventListener listener);
}
