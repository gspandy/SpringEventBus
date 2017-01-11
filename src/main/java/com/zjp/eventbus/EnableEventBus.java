package com.zjp.eventbus;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * Project: SpringEventBus
 * Module Desc:com.zjp.eventbus
 * User: zjprevenge
 * Date: 2017/1/11
 * Time: 10:26
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Import(EventBusConfiguration.class)
@Documented
public @interface EnableEventBus {
}
