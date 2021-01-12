package com.jiun.springboot.actual.combat.chapter1.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UseFunctionService {


    /**
     * Autowired 和 Resource 是等效的
     * Autowired 是byType注入
     * Resource 是默认按照byName注入的，Resource 有两个属性，name和type，是可以选择注入方式的。
     *
     */
//    @Autowired
    @Resource
    private FunctionService functionService;

    public void useServicePrint() {
        functionService.print();
    }
}
