package com.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Project: SpringEventBus
 * Module Desc:PACKAGE_NAME
 * User: zjprevenge
 * Date: 2017/1/11
 * Time: 11:04
 */
public class EventBusTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        SpringEventBusDemo springEventBusDemo = context.getBean("springEventBusDemo", SpringEventBusDemo.class);
        Message message = new Message();
        message.setTopic("event.bus.test");
        message.setContent("this test spring Event bus");
        springEventBusDemo.postMessage(message);
    }
}
