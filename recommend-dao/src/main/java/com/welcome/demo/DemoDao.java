package com.welcome.demo;

import com.welcome.demo.model.Demo;

import java.util.List;

public interface DemoDao {
    List<Demo> getDemoAll(Demo demo);
}
