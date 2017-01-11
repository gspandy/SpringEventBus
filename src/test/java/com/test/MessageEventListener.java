package com.test;

import com.google.common.eventbus.Subscribe;
import com.zjp.eventbus.EventListener;
import org.springframework.stereotype.Component;

/**
 * Project: SpringEventBus
 * Module Desc:PACKAGE_NAME
 * User: zjprevenge
 * Date: 2017/1/11
 * Time: 11:00
 */
@Component
public class MessageEventListener implements EventListener<Message> {
    /**
     * 监听事件消息
     *
     * @param event
     */
    @Subscribe
    public void onEvent(Message event) {
        System.out.println("topic:" + event.getTopic() + "----" + "content:" + event.getContent());
    }
}
