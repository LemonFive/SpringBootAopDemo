package com.example.demo.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

/**
 * @desc:
 * @author: CuiShiHao
 **/
@Configuration
@ComponentScan("com.example.demo.aop")
@EnableAspectJAutoProxy
public class AppConfig {
}
