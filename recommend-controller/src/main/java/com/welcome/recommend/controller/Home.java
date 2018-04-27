package com.welcome.recommend.controller;

import com.welcome.demo.model.Demo;
import com.welcome.demo.service.DemoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RequestMapping("/home")
@RestController
public class Home {

    @Resource(name = "demoService")
    private DemoService demoService;


    @RequestMapping("/home1")
    public List<Demo> home(){
        Demo demo = new Demo();
        return demoService.getDemoAll(demo);
    }
}
