package com.welcome.demo.dao;

import com.welcome.demo.model.Demo;

import java.util.List;

public interface DemoDao {
    List<Demo> getDemoAll(Demo demo);
}
