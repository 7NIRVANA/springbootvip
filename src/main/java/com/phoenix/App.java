package com.phoenix;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Phoenix
 * @version v 1.0
 * @description 示例
 * @date 2019/12/24 19:05
 */
@RestController
//@EnableAutoConfiguration
@SpringBootApplication//会扫描该类所在包及子包
@MapperScan("com.phoenix.dao")
public class App {

    @RequestMapping("/")
    String home(){
        return "Hello World!";
    }

    public static void main(String[] args) {
        //启动类 定制化参数
        SpringApplication.run(App.class,args);
    }
}
