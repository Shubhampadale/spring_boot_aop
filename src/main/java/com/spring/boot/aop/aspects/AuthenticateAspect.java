package com.spring.boot.aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AuthenticateAspect {


    @Around("execution(* com.spring.boot.aop.LoginService.mainLogic(String,String) )")
    public void checkUser(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{


        String username = proceedingJoinPoint.getArgs()[0].toString();
        String password = proceedingJoinPoint.getArgs()[1].toString();

        if(username.equals("admin") && password.equals("admin123")){

            proceedingJoinPoint.proceed();
            System.out.println("User having correct credentials!!!!");
            System.out.println("Checking the only file to upload to github...");

        }
        else{

            System.out.println("User is UnAuthenticated!!!...");
            throw new RuntimeException("User is not Authenticated!!!");
        }
    }

}
