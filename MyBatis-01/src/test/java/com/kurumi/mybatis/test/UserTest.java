package com.kurumi.mybatis.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.kurumi.mybatis.entity.User;
import com.kurumi.mybatis.mapper.UserMapper;

public class UserTest {
	@Test
	public void testAddUser() throws IOException {
		//加载配置文件
		InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
		//获取SqlSessionFactoryBuilder
		SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
		//获取SqlSessionFactory
		SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
		//获取SqlSession
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		//获取mapper接口
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		int result = userMapper.addUser();
		//提交事务
//		sqlSession.commit();
		System.out.println("result:"+result);
	}
	@Test
	public void testUpdateUser() throws IOException {
		InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
		SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
		SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		userMapper.updateUser();
	}
	@Test
	public void testDeleteUser() throws IOException {
		InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
		SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
		SqlSessionFactory factory = builder.build(is);
		SqlSession session = factory.openSession(true);
		UserMapper mapper = session.getMapper(UserMapper.class);
		mapper.deleteUser();
	}
	@Test
	public void testGetUserById() throws IOException {
		InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
		SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
		SqlSessionFactory factory = builder.build(is);
		SqlSession session = factory.openSession(true);
		UserMapper mapper = session.getMapper(UserMapper.class);
		User user = mapper.getUserById();
		System.out.println(user);
	}
	@Test
	public void testGetAllUser() throws IOException {
		InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
		SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
		SqlSessionFactory factory = builder.build(is);
		SqlSession session = factory.openSession(true);
		UserMapper mapper = session.getMapper(UserMapper.class);
		List<User> userList = mapper.getAllUser();
		userList.forEach(System.out::println);
	}
}
