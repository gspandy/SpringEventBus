package com.zjp.eventbus;

import com.google.common.eventbus.EventBus;
import org.springframework.aop.support.AopUtils;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * Project: SpringEventBus
 * Module Desc:com.zjp.eventbus
 * User: zjprevenge
 * Date: 2017/1/11
 * Time: 10:07
 */
public class EventBusRegisterBeanPostProcessor implements BeanPostProcessor {

    private Object primitiveBean;

    private EventBus eventBus;

    public EventBusRegisterBeanPostProcessor(EventBus eventBus) {
        this.eventBus = eventBus;
    }

    public Object getPrimitiveBean() {
        return primitiveBean;
    }

    public void setPrimitiveBean(Object primitiveBean) {
        this.primitiveBean = primitiveBean;
    }

    public EventBus getEventBus() {
        return eventBus;
    }

    public void setEventBus(EventBus eventBus) {
        this.eventBus = eventBus;
    }

    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        this.primitiveBean = bean;
        return bean;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        //EventListener接口为事件监听器
        if (bean instanceof EventListener) {
            //如果是经过代理的类，应获取去原来的类型
            if (AopUtils.isAopProxy(bean)) {
                registerListener((EventListener) bean);
            } else {
                registerListener((EventListener) bean);
            }
        }
        return bean;
    }

    private void registerListener(EventListener listener) {
        eventBus.register(listener);
    }
}
