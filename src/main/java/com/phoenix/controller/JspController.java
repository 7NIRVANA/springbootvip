package com.phoenix.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Phoenix
 * @version v 1.0
 * @description jsp控制层
 * @date 2019/12/25 18:38
 */
@RequestMapping("/jsp")
@Controller
public class JspController {

    @RequestMapping("/hi")
    public String sayHello(){
        return "index";
    }
}
