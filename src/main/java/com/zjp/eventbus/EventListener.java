package com.zjp.eventbus;

import com.google.common.eventbus.Subscribe;

/**
 * Project: SpringEventBus
 * Module Desc:com.zjp.eventbus
 * User: zjprevenge
 * Date: 2017/1/11
 * Time: 9:45
 * 实现该接口的进行事件订阅
 */
public interface EventListener {

    <T> void onEvent(T event);
}
