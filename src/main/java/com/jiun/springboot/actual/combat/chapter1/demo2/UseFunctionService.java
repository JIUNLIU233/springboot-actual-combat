package com.jiun.springboot.actual.combat.chapter1.demo2;

/**
 * 这里没有写任何关于声明Bean注解
 */
public class UseFunctionService {

    private FunctionService functionService;

    public UseFunctionService(FunctionService functionService) {
        this.functionService = functionService;
    }

    public void useFunctionService() {
        functionService.print();
    }
}
