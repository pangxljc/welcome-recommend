package com.welcome.recommend.dao.user.impl;

import com.welcome.recommend.dao.user.UserDao;
import com.welcome.recommend.model.user.User;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Component("userDao")
public class UserDaoImpl implements UserDao {

    @Resource(name = "sqlSessionTemplate")
    private SqlSessionTemplate sqlSessionTemplate;

    /**
     * 注册新增
     * @param user
     */
    @Override
    public void insertUser(User user) {
        this.sqlSessionTemplate.insert("user.insertUser",user);
    }

    /**
     * 查询所有
     * @param user
     * @return
     */
    @Override
    public List<User> selectUserAll(User user) {
        return this.sqlSessionTemplate.selectList("user.selectUserAll",user);
    }
}
