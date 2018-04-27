package com.welcome.demo.service.impl;


import com.welcome.demo.model.Demo;
import com.welcome.demo.dao.DemoDao;
import com.welcome.demo.service.DemoService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Component("demoService")
public class DemoServiceImpl implements DemoService {

    @Resource(name = "demoDao")
    private DemoDao demoDao;

    @Override
    public List<Demo> getDemoAll(Demo demo) {
        demo.setUser_id(1);
        return demoDao.getDemoAll(demo);
    }
}
