package com.jiun.springboot.actual.combat.chapter1.demo1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(DiConfig.class);
        UseFunctionService bean = applicationContext.getBean(UseFunctionService.class);
        bean.useServicePrint();
    }
}
