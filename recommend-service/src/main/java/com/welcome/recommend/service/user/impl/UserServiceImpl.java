package com.welcome.recommend.service.user.impl;

import com.welcome.recommend.common.exception.BusinessException;
import com.welcome.recommend.common.base.Result;
import com.welcome.recommend.common.util.MD5Utils;
import com.welcome.recommend.dao.user.UserDao;
import com.welcome.recommend.model.user.User;
import com.welcome.recommend.service.user.UserService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service
@Component("userService")
public class UserServiceImpl implements UserService {

    private static final String USERNAME = "userName";
    private static final String EMAIL = "email";

    @Resource(name = "userDao")
    private UserDao userDao;

    /**
     * 注册
     * @param user
     * @return
     */
    @Override
    public Result register(User user) throws Exception{
        Result result = new Result(false);
        //校验有效性数据是否为空
        if (StringUtils.isEmpty(user.getUserName()) || StringUtils.isEmpty(user.getPassword()) || StringUtils.isEmpty(user.getEmail())){
            throw new BusinessException("用户数据不完整，注册失败!");
        }
        //校验userName和email是否重复
        Boolean flag1 = checkCode(user.getUserName(),USERNAME);
        Boolean flag2 = checkCode(user.getEmail(),EMAIL);
        if (flag1 && flag2 == true){
            result.setErrorMessage("用户名或邮箱重复，请重试！");
            return result;
        }
        String md5Password = MD5Utils.md5Password(user.getPassword());
        user.setPassword(md5Password);
        user.setRegisterTime(new Date());

        userDao.insertUser(user);

        result.setSuccess(true);
        result.setSuccessMessage("恭喜您，注册成功！");
        return result;
    }

    /**
     * 需要校验userName,email是否重复
     * @param str
     * @param Type
     * @return
     */
    private Boolean checkCode(String str,String Type){
        Boolean flag = null;
        User user = new User();
        if (Type.equals(USERNAME)){
            user.setUserName(str);
        }else if (Type.equals(EMAIL)) {
            user.setEmail(str);
        }else {
            return null;
        }
        //需要校验用户名和邮箱是否重复
        List<User> userList = userDao.selectUserAll(user);
        if (CollectionUtils.isEmpty(userList)){
            flag = false;
        }else {
            flag = true;
        }
        return flag;
    }
}
