package com.jiun.springboot.actual.combat.chapter2.demo3;

public class BeanWayService {


    public void init(){
        System.out.println("BeanWayService init");
    }

    public void print() {
        System.out.println("BeanWayService print~~~");
    }

    public void destroy() {
        System.out.println("BeanWayService destroy");
    }
}
