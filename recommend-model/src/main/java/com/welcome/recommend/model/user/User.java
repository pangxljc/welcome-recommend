package com.welcome.recommend.model.user;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable{

    private static final long serialVersionUID = 1L;

    //用户主键
    private Integer userId;
    //用户名
    private String userName;
    //用户密码
    private String password;
    //注册时间
    private Date registerTime;
    //最后登录时间
    private Date lastLoginTime;
    //邮箱
    private String email;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
