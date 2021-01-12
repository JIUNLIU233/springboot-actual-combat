package com.jiun.springboot.actual.combat.chapter1.demo2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {


    /**
     * 通过@Bean注解 声明当前方法返回的是一个Bean，这个Bean默认是单例的。
     * @return
     */
    @Bean
    public FunctionService functionService() {
        return new FunctionService();
    }

    @Bean
    public UseFunctionService useFunctionService() {
        return new UseFunctionService(functionService());
    }
}
