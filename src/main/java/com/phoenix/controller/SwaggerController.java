package com.phoenix.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Phoenix
 * @version v 1.0
 * @description Swagger控制层
 * @date 2019/12/26 9:33
 */
@RestController
@RequestMapping("/swagger")
public class SwaggerController {

    @ApiOperation(value = "获取用户信息",notes="根据id来获取用户详细信息")
    @ApiImplicitParam(name="id",value="用户ID",required = true,dataType = "String")
    @RequestMapping(value="/{id}",method = RequestMethod.GET)
    public Map<String,String> getInfo(@PathVariable String id){
        Map<String,String> map = new HashMap<>();
        map.put("name","Phoenix");
        map.put("age","27");
        return map;
    }
}
