package com.jiun.springboot.actual.combat.chapter1.demo3;

import org.springframework.stereotype.Service;

@Service
public class DemoMethodService {
    public void print() {
        System.out.println(this + " demo3 DemoMethodService print");
    }
}
