package com.phoenix.dao;


import com.phoenix.model.User;
import org.apache.ibatis.annotations.Param;

//@Mapper
public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    User findByUsernameAndPasswd(@Param("username") String username, @Param("passwd") String passwd);
}