package com.spring.boot.aop;

import com.spring.boot.aop.beans.Employee;
import com.spring.boot.aop.services.LoginService;
import com.spring.boot.aop.services.ProductService;
import com.spring.boot.aop.services.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootAopApplication {

	public static void main(String[] args) {


		ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringBootAopApplication.class, args);

		//Employee employee= applicationContext.getBean(Employee.class);

		//employee.doWork();

		LoginService loginService =  applicationContext.getBean(LoginService.class);
		//loginService.doLogin();
		loginService.mainLogic("admin","admin123");

		//ProductService productService =  applicationContext.getBean(ProductService.class);
		//productService.printAllProduct();

		//UserService userService =  applicationContext.getBean(UserService.class);
		//userService.createUser("Shubham");
	}

}
