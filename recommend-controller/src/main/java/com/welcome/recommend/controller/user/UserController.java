package com.welcome.recommend.controller.user;

import com.welcome.recommend.common.base.Result;
import com.welcome.recommend.common.exception.BusinessException;
import com.welcome.recommend.model.user.User;
import com.welcome.recommend.service.user.UserService;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.logging.Logger;

@RestController
public class UserController {

    @Resource(name = "userService")
    private UserService userService;

//    private final static Logger logger = Logger.getLogger(String.valueOf(UserController.class));

    @RequestMapping(value = "user/register",method = {RequestMethod.POST,RequestMethod.GET})
    public @ResponseBody Result register(User user){
        Result result = null;
        if (!ObjectUtils.isEmpty(user)){
            try {
                result = userService.register(user);
            } catch (Exception e) {
                result = new Result(false);
                if (e instanceof BusinessException){
                    result.setErrorMessage(e.getMessage());
                }else {
                    result.setErrorMessage("登录出现异常,异常信息："+ e.getMessage());
                }
            }
        }
        return result;
    }
}
