package com.jiun.springboot.actual.combat.chapter2.demo5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * 事件发布器
 */
@Component
public class DemoPublisher {

    @Autowired
    ApplicationContext applicationContext;


    public void publish(String msg) {
        applicationContext.publishEvent(new DemoEvent(this, msg));
    }
}
