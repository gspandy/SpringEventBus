package com.test;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * Project: SpringEventBus
 * Module Desc:PACKAGE_NAME
 * User: zjprevenge
 * Date: 2017/1/11
 * Time: 10:54
 */
@Configuration
@ComponentScan(basePackages = {"com.test"})
@EnableAsync
@Import({
        EventBusConfig.class,
//        TransactionConfig.class,
})
public class ApplicationConfig {
}
