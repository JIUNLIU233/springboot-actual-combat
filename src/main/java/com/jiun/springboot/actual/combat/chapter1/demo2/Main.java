package com.jiun.springboot.actual.combat.chapter1.demo2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        UseFunctionService bean = context.getBean(UseFunctionService.class);
        UseFunctionService bean2 = context.getBean(UseFunctionService.class);
        bean.useFunctionService();
        System.out.println("===============================");
        bean2.useFunctionService();
    }
}
