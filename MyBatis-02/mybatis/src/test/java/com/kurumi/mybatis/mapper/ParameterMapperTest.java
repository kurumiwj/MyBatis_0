package com.kurumi.mybatis.mapper;

import com.kurumi.mybatis.entity.User;
import com.kurumi.mybatis.utils.SqlSessionUtils;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class ParameterMapperTest {
    @Test
    public void testGetAllUser() throws IOException {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        List<User> userList = mapper.getAllUser();
        userList.forEach(System.out::println);
    }
    @Test
    public void testGetUserByUsername(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        User user = mapper.getUserByUsername("admin");
        System.out.println(user);
    }
    @Test
    public void testLogin(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        User user = mapper.login("admin","123456");
        System.out.println(user);
    }
    @Test
    public void testLogin1(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        Map<String, String> map = new HashMap<>();
        map.put("username","admin");
        map.put("password","123456");
        User user = mapper.login1(map);
        System.out.println(user);
    }
    @Test
    public void testLogin2(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        User user = mapper.login2("admin", "123456");
        System.out.println(user);
    }
    @Test
    public void testAddUser(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        User user = new User(null,"saber","123456",21,"女","saber@126.com");
        mapper.addUser(user);
    }
}
