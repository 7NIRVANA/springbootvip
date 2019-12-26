package com.phoenix.service;

/**
 * @author Phoenix
 * @version v 1.0
 * @description 用户服务层
 * @date 2019/12/25 17:44
 */
public interface IUserService {

    boolean login(String username,String passwd);

    boolean register(String username,String passwd);

    void batchAdd(String username,String passwd);
}
