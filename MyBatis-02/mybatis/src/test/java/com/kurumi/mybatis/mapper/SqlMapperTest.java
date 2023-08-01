package com.kurumi.mybatis.mapper;

import com.kurumi.mybatis.entity.User;
import com.kurumi.mybatis.utils.SqlSessionUtils;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class SqlMapperTest {
    @Test
    public void testGetUserByLike() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SqlMapper mapper = sqlSession.getMapper(SqlMapper.class);
        List<User> userList = mapper.getUserByLike("dm");
        userList.forEach(System.out::println);
    }
    @Test
    public void testDeleteMore(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SqlMapper mapper = sqlSession.getMapper(SqlMapper.class);
        mapper.deleteMore("6,7,8");
    }
    @Test
    public void testGetUserByTableName(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SqlMapper mapper = sqlSession.getMapper(SqlMapper.class);
        List<User> userList = mapper.getUserByTableName("t_user");
        userList.forEach(System.out::println);
    }
    @Test
    public void testAddUser(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SqlMapper mapper = sqlSession.getMapper(SqlMapper.class);
        User user = new User(null, "saber", "123456", 19, "女", "saber@126.com");
        mapper.addUser(user);
        System.out.println(user);
    }
}
