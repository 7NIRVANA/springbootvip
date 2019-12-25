package com.ace.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Phoenix
 * @version v 1.0
 * @description 用户控制层
 * @date 2019/12/24 19:26
 */
@Controller
public class UserController {
    @RequestMapping("/hello")
    public Object sayHello(){
        return "hello";
    }
}
