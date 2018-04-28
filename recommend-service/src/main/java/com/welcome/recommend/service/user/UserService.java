package com.welcome.recommend.service.user;

import com.welcome.recommend.common.base.Result;
import com.welcome.recommend.model.user.User;

public interface UserService {
    /**
     * 注册
     * @param user
     * @return
     */
    public Result register(User user) throws Exception;
}
