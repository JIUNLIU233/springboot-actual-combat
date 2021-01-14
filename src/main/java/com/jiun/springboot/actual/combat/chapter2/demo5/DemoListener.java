package com.jiun.springboot.actual.combat.chapter2.demo5;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class DemoListener implements ApplicationListener<DemoEvent> {
    @Override
    public void onApplicationEvent(DemoEvent demoEvent) {
        String msg = demoEvent.getMsg();
        System.out.println("DemoListener 接收到了 DemoEven 发布的消息 ：" + msg);
    }
}
