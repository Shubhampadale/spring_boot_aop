package com.spring.boot.aop.services;


import org.springframework.stereotype.Service;

@Service  //similar to component
public class ProductService {

    public void printAllProduct(){

        System.out.println("All Products are...");
        System.out.println("Product 1");
        System.out.println("Product 2");
    }
}
