package com.welcome.demo.impl;

import com.welcome.demo.Demo;
import com.welcome.demo.DemoDao;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Component("demoDao")
public class DemoDaoImpl implements DemoDao {

    @Resource(name = "sqlSessionTemplate")
    private SqlSessionTemplate sqlSessionTemplate;

    @Override
    public List<Demo> getDemoAll(Demo demo) {
        return sqlSessionTemplate.selectList("demo.getDemoAll",demo);
    }
}
