package com.phoenix.service.impl;

import com.phoenix.dao.UserMapper;
import com.phoenix.model.User;
import com.phoenix.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Objects;

/**
 * @author Phoenix
 * @version v 1.0
 * @description
 * @date 2019/12/25 17:45
 */
@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    UserMapper userMapper;
    @Override
    public boolean register(String username, String passwd) {
        User user = new User();
        user.setPasswd(passwd);
        user.setUsername(username);
        int insert = userMapper.insert(user);
        return insert > 0 ;
    }

    @Override
    public boolean login(String username, String passwd) {
        User user = userMapper.findByUsernameAndPasswd(username, passwd);
        return user != null;
    }

    @Transactional
    @Override
    public void batchAdd(String username, String passwd) {
        User user = new User();
        user.setPasswd(passwd);
        user.setUsername(username);
        int insert = userMapper.insert(user);
        int i = 10/0;
        user = new User();
        user.setPasswd(passwd+"2");
        user.setUsername(username);
        int insert2 = userMapper.insert(user);
    }
}
