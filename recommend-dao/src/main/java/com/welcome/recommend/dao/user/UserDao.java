package com.welcome.recommend.dao.user;

import com.welcome.recommend.model.user.User;

import java.util.List;

public interface UserDao {
    /**
     * 注册新增
     * @param user
     */
    public void insertUser(User user);

    /**
     * 查询所有
     * @param user
     * @return
     */
    public List<User> selectUserAll(User user);
}
