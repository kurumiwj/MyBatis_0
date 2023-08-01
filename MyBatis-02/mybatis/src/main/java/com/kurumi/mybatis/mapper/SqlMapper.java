package com.kurumi.mybatis.mapper;

import com.kurumi.mybatis.entity.User;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SqlMapper {
    //根据用户名模糊查询用户信息
    List<User> getUserByLike(@Param("username") String username);
    //批量删除
    void deleteMore(@Param("ids") String ids);
    //查询指定表中的数据
    List<User> getUserByTableName(@Param("tableName") String tableName);
    //添加用户并获取自增主键
    void addUser(User user);
}
