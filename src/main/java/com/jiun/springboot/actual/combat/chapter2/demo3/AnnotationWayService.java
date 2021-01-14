package com.jiun.springboot.actual.combat.chapter2.demo3;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class AnnotationWayService {


    @PostConstruct
    public void init(){
        System.out.println("AnnotationWayService init");
    }

    public void print(){
        System.out.println("AnnotationWayService print");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("AnnotationWayService destroy");
    }
}
