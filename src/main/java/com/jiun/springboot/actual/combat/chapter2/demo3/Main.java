package com.jiun.springboot.actual.combat.chapter2.demo3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) throws Exception{
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PrePostConfig.class);
        BeanWayService beanWayService = context.getBean(BeanWayService.class);
        beanWayService.print();

        Thread.sleep(1000);

        AnnotationWayService annotationWayService = context.getBean(AnnotationWayService.class);
        annotationWayService.print();

        context.close();
    }
}
