package com.jiun.springboot.actual.combat.chapter1.demo3;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Aspect
@Component
public class LogAspect {

    @Pointcut("@annotation(com.jiun.springboot.actual.combat.chapter1.demo3.Action)")
    public void annotationPointcut() {
    }

    @After("annotationPointcut()")
    public void after(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        Action annotation = method.getAnnotation(Action.class);
        System.out.println("注解式拦截：" + annotation.name());
    }


    @Before("execution(* com.jiun.springboot.actual.combat.chapter1.demo3.DemoMethodService.*(..))")
    public void before(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        System.out.println("方法规则拦截：" + method.getName());
    }
}
