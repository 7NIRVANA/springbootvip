package com.phoenix.test;

import com.phoenix.App;
import com.phoenix.dao.UserMapper;
import com.phoenix.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @author Phoenix
 * @version v 1.0
 * @description 用戶测试
 * @date 2019/12/24 19:54
 */
@SpringBootTest/*(classes= App.class)   *///classes可写可不写
@RunWith(SpringRunner.class)
public class UserTest {
    @Resource
    private UserMapper userMapper;

    @Test
    public void testAdd(){

        User user = new User();
        user.setUsername("phoenix");
        user.setPasswd("123456");
        userMapper.insert(user);
    }

    @Test
    public void testFindUser(){
        User phoenix = userMapper.findByUsernameAndPasswd("phoenix", "123456");
        System.out.println(phoenix);
    }
}
