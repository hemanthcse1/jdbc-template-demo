package com.hemanth.jdbctemplatedemo;

import com.hemanth.jdbctemplatedemo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JdbcTemplateDemoApplication {

    @Autowired
    ProductService productService;


    public static void main(String[] args) {
        SpringApplication.run(JdbcTemplateDemoApplication.class, args);
        System.out.println("Spring boot JDBC template");
    }

}
