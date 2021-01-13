package com.jiun.springboot.actual.combat.chapter2.demo1;

import org.springframework.stereotype.Service;

@Service
public class DemoSingletonService {

    public void print(){
        System.out.println("DemoSingletonService print");
    }
}
