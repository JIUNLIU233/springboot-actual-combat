package com.jiun.springboot.actual.combat.chapter1.demo1;

import org.springframework.stereotype.Service;

/**
 * @Service 声明当前注解的类是Spring管理的一个Bean，
 * 其中使用@Component , @Service @Repository @Controller 是等效的，可按照需要选择使用
 */
@Service
public class FunctionService {

    public void print() {
        System.out.println("function service 的 print 方法~~~");
    }
}
