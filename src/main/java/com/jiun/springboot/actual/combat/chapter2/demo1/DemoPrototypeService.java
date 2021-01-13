package com.jiun.springboot.actual.combat.chapter2.demo1;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")
public class DemoPrototypeService {

    public  void print() {
        System.out.println("DemoPrototypeService print ~~~");
    }
}
