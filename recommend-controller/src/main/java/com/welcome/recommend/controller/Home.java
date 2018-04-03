package com.welcome.recommend.controller;

import com.welcome.demo.Demo;
import com.welcome.demo.DemoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RequestMapping("/demo")
@RestController
public class Home {

    @Resource(name = "demoService")
    private DemoService demoService;


    @RequestMapping("/home")
    public List<Demo> home(){
        Demo demo = new Demo();
        return demoService.getDemoAll(demo);
    }
}
