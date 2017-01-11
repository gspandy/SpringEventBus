package com.test;

import com.zjp.eventbus.SpringEventBus;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Project: SpringEventBus
 * Module Desc:PACKAGE_NAME
 * User: zjprevenge
 * Date: 2017/1/11
 * Time: 10:58
 */
@Component
public class SpringEventBusDemo {

    @Resource
    private SpringEventBus springEventBus;

    public void postMessage(Message message) {
        springEventBus.publish(message);
    }
}
