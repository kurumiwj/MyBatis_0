package com.kurumi.mybatis.mapper;

import com.kurumi.mybatis.entity.User;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

public interface SelectMapper {
    //根据id查询用户信息
    List<User> getUserById(@Param("id") Integer id);
    //查询所有用户信息
    List<User> getAllUser();
    //查询用户总数
    Integer getTotalUser();
    //根据id查询用户信息返回map
    Map<String,Object> getUserById1(@Param("id") Integer id);
    //查询所有用户信息返回map
    List<Map<String,Object>> getAllUser1();
    @MapKey("id")
    Map<String,Object> getAllUser2();
}
