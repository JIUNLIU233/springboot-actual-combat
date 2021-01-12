package com.jiun.springboot.actual.combat.chapter1.demo3;

import org.springframework.stereotype.Service;

@Service
public class DemoAnnotationService {

    @Action(name = "注解式拦截的print操作")
    public void print() {
        System.out.println(this + " demo3 DemoAnnotationService print");
    }
}
