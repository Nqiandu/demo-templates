package com.xxx.mapper;

import com.xxx.model.User;

import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(User record);

    User selectByPrimaryKey(Long id);

    List<User> selectAll();

    int updateByPrimaryKey(User record);

    /**
     * @description 通过账号和密码查询用户信息
     * @return
     */
    User selectUserByUsernamePassword(User user);
}