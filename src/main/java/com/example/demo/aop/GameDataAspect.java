package com.example.demo.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @desc:技术统计
 * @author: CSH
 **/
@Aspect
@Component
public class GameDataAspect {
    /**
     * 定义切入点，切入点为com.example.demo.aop.AopController中的所有函数
     *通过@Pointcut注解声明频繁使用的切点表达式
     */
    @Pointcut("execution(public * com.example.demo.aop.AopController.*(..)) && args(object))")
    public void GameDataAspect(Object object){

    }

    /**
     * @description  使用环绕通知
     */
    @Around("GameDataAspect(object)")
    public void doAroundGameData(ProceedingJoinPoint pjp,Object object) throws Throwable {
        try{
            System.out.println("球星上场前热身！");
            pjp.proceed();
            System.out.println("球星本场得到" + object + "分" );
        }
        catch(Throwable e){
            System.out.println("异常通知：球迷要求退票！");
        }
    }
}
