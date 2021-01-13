package com.jiun.springboot.actual.combat.chapter2.demo2;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;


@Configuration
@ComponentScan("com.jiun.springboot.actual.combat.chapter2.demo2")
@PropertySource("classpath:chapter2/demo2/test.properties")
public class ElConfig {

    @Value("小琪琪")
    private String normal;
    @Value("#{systemProperties['os.name']}")
    private String osName;
    @Value("#{T(java.lang.Math).random()*100.0}")
    private double randomNumber;
    @Value("#{demoService.another}")
    private String fromAnother;
    @Value("classpath:chapter2/demo2/test.txt")
    private Resource testFile;
    @Value("https://www.baidu.com")
    private Resource testUrl;
    @Value("${book.name}")
    private String bookName;
    @Autowired
    private Environment environment;

    public void outputResource() {
        try {
            System.out.println("normal:" + normal);
            System.out.println("osName:" + osName);
            System.out.println("randomNumber:" + randomNumber);
            System.out.println("fromAnother:" + fromAnother);
            System.out.println("testFile:" + IOUtils.toString(testFile.getInputStream(), "utf-8"));
            System.out.println("testUrl:" + IOUtils.toString(testUrl.getInputStream(), "utf-8"));
            System.out.println("bookName:" + bookName);
            System.out.println("env:" + environment.getProperty("book.name"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
