package com.welcome.demo.controller;

import com.welcome.demo.model.Demo;
import com.welcome.demo.service.DemoService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@SpringBootApplication
@ComponentScan(basePackages = {"com.welcome"})
public class DemoController {

    public static void main(String[] args) {
        SpringApplication.run(DemoController.class,args);
    }
}
