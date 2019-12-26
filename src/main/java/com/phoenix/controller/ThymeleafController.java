package com.phoenix.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Phoenix
 * @version v 1.0
 * @description 模板控制层
 * @date 2019/12/26 9:15
 */
@Controller
@RequestMapping("/tpl")
public class ThymeleafController {
    @RequestMapping("/testThymeleaf")
    public String testThymeleaf(ModelMap map){
        //设置属性
        map.addAttribute("name","Phoenix");
        //testThymeleaf:为模板文件的名称
        //对应src/main/resources/templates/testThymeleaf.html
        return "testThymeleaf";
    }
}
