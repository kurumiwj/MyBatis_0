package com.kurumi.mybatis.mapper;

import com.kurumi.mybatis.entity.User;
import com.kurumi.mybatis.utils.SqlSessionUtils;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class SelectMapperTest {
    @Test
    public void testGetUserById() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        List<User> userList = mapper.getUserById(3);
        System.out.println(userList);
    }
    @Test
    public void testGetAllUser(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        mapper.getAllUser().forEach(System.out::println);
    }
    @Test
    public void testGetTotalUser(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        System.out.println(mapper.getTotalUser());
    }
    @Test
    public void testGetUserById1(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        Map<String, Object> map = mapper.getUserById1(3);
        System.out.println(map);
    }
    @Test
    public void testGetAllUser1(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        mapper.getAllUser1().forEach(System.out::println);
    }
    @Test
    public void testGetAllUser2(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        Map<String, Object> map = mapper.getAllUser2();
        System.out.println(map);
    }
}
