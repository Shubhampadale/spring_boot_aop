package com.spring.boot.aop.aspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogsAspects {

    @Before("execution(* com.spring.boot.aop.services.*.*(*))")
    //advicess: actual code
    public  void maintainLogs(){

        System.out.println("Maintained Log Executed!!....");
    }

    @After("execution(* com.spring.boot.aop.services.LoginService.doLogin()))")
    public void maintainLogsAfter(){

        System.out.println("Mainatained Logs Executed After!!!..");
    }

}
