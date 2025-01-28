package com.spring.boot.aop.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class Employee implements InitializingBean, DisposableBean {

    public void Employee(){

        System.out.println("Employee is created!!..");
    }

    public void doWork(){

        System.out.println("Employee is working!!!...");
    }

    @Override
    public void afterPropertiesSet() throws Exception {

        System.out.println("Initializing Employee!!..");
        System.out.println("DB connections are open...");
    }

    @Override
    public void destroy() throws Exception {

        System.out.println("Cleaning up the Employee!!..");
        System.out.println("Closing the DB connections which are open...");
    }
}
