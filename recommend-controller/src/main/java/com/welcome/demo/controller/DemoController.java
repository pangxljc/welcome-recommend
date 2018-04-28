package com.welcome.demo.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.welcome.recommend"})
public class DemoController {

    public static void main(String[] args) {
        SpringApplication.run(DemoController.class,args);
    }
}
