package com.itheima.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

//1.制作通知类，在类中定义一个方法用于完成共性功能
@Component("advice")
@Aspect
public class AOPAdvice {
    @Pointcut("execution(* *..*(..))")
    public void pointcut() {
    }

    ;
@Before("pointcut()")
    public void function(){
        System.out.println("共性功能");
    }

}
