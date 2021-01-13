package com.jiun.springboot.actual.combat.chapter2.demo2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class DemoService {

    @Value("其他类属性")
    private String another;


    public String getAnother() {
        return another;
    }

    public void setAnother(String another) {
        this.another = another;
    }
}
