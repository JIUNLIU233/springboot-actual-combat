package com.jiun.springboot.actual.combat.chapter2.demo5;

import org.springframework.context.ApplicationEvent;

/**
 * 自定义事件
 */
public class DemoEvent extends ApplicationEvent {

    private String msg;

    public DemoEvent(Object source, String msg) {
        super(source);
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
