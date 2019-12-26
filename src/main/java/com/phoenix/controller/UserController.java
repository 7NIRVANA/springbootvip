package com.phoenix.controller;

import com.phoenix.service.IUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Phoenix
 * @version v 1.0
 * @description 用户控制层
 * @date 2019/12/24 19:26
 */
@RestController
public class UserController {

    private final Logger logger = LoggerFactory.getLogger(UserController.class);
    @Autowired
    IUserService userService;

    @RequestMapping("/hello")
    public Object sayHello(){

        logger.info("这是一个hello info级别日志!");
        logger.debug("这是一个hello debug级别日志!");
        return "hello";
    }

    @RequestMapping("/login")
    public String login(String username,String passwd){
        boolean login = userService.login(username,passwd);
        return login ? "登录成功" : "登录失败";

    }

    @RequestMapping("/register")
    public String register(String username,String passwd){
        boolean register = userService.register(username, passwd);
        return register ? "注册成功" : "注册失败";
    }

    @RequestMapping("register2")
        public String register2(String username,String passwd){
            userService.batchAdd(username, passwd);
            return "添加成功!";
        }


}
