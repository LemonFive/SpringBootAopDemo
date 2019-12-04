package com.example.demo.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.annotation.Annotation;

/**
 * @desc:
 * @author: CuiShiHao
 **/
public class codeAnalysis {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext
                = new AnnotationConfigApplicationContext(AppConfig.class);
        annotationConfigApplicationContext.getBean(AopController.class).Harden();

    }
}
