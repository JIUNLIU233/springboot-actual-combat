package com.jiun.springboot.actual.combat.chapter1.demo1;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Configuration 声明当前类是一个配置类
 * @ComponentScan 自动扫描包下所有使用@Service，@Component，@Repository和@Controller的类，并注册为Bean
 */
@Configuration
@ComponentScan("com.jiun.springboot.actual.combat.chapter1.demo1")
public class DiConfig {
}
