package com.spring.boot.aop.services;

import org.springframework.stereotype.Service;

@Service
public class LoginService {


    public void mainLogic(String username, String password){

        System.out.println("User is authenticated....");
        System.out.println("Username is :"+username);
        System.out.println("Password is: "+password);
        System.out.println("Access the useful API's");
    }
    public void doLogin(){

        System.out.println("Logging user!!");
        System.out.println("Login Success!!");
    }
}
