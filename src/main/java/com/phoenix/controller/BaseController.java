package com.phoenix.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Phoenix
 * @version v 1.0
 * @description 基础控制层
 * @date 2019/12/25 18:27
 */
@RestController
public class BaseController {

    @RequestMapping("/404.do")
    public Object error404(){
        return "您要找的页面不存在!";
    }
}
