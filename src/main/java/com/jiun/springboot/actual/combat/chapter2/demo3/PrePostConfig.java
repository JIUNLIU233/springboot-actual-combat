package com.jiun.springboot.actual.combat.chapter2.demo3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.jiun.springboot.actual.combat.chapter2.demo3")
public class PrePostConfig {


    @Bean(initMethod = "init", destroyMethod = "destroy")
    BeanWayService beanWayService() {
        return new BeanWayService();
    }

    @Bean
    AnnotationWayService annotationWayService() {
        return new AnnotationWayService();
    }
}
