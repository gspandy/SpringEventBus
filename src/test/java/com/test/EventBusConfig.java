package com.test;

import com.zjp.eventbus.EnableEventBus;
import com.zjp.eventbus.SpringEventBus;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Project: SpringEventBus
 * Module Desc:PACKAGE_NAME
 * User: zjprevenge
 * Date: 2017/1/11
 * Time: 10:54
 */
@Configuration
@EnableEventBus
public class EventBusConfig {
    @Bean
    public SpringEventBus springEventBus() {
        return new SpringEventBus();
    }
}
