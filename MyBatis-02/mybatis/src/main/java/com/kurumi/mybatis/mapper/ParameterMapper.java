package com.kurumi.mybatis.mapper;

import com.kurumi.mybatis.entity.User;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;

public interface ParameterMapper {
    //查询所有员工信息
    List<User> getAllUser();
    //根据用户名查询用户信息
    User getUserByUsername(String username);
    //验证登录
    User login(String username,String password);
    User login1(Map<String,String> map);
    User login2(@Param("username") String username,@Param("password") String password);
    //添加用户信息
    void addUser(User user);
}
