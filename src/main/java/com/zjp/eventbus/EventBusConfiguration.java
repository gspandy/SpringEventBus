package com.zjp.eventbus;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;

/**
 * Project: SpringEventBus
 * Module Desc:com.zjp.eventbus
 * User: zjprevenge
 * Date: 2017/1/11
 * Time: 10:27
 */
@Configuration
public class EventBusConfiguration {

    @Resource
    private SpringEventBus springEventBus;

    @Bean
    public EventBusRegisterBeanPostProcessor eventBusRegisterBeanPostProcessor() {
        return new EventBusRegisterBeanPostProcessor(springEventBus);
    }
}
