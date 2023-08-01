package com.kurumi.mybatis.mapper;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.kurumi.mybatis.entity.Emp;
import com.kurumi.mybatis.utils.SqlSessionUtils;

public class CacheMapperTest {
	@Test
	public void testCacheOne() {
		SqlSession sqlSession = SqlSessionUtils.getSqlSession();
		CacheMapper mapper = sqlSession.getMapper(CacheMapper.class);
		Emp emp = mapper.getEmpById(1);
		System.out.println(emp);
		sqlSession.clearCache();
		Emp emp1 = mapper.getEmpById(1);
		System.out.println(emp1);
	}
	@Test
	public void testCacheTwo() {
		try (InputStream is = Resources.getResourceAsStream("mybatis-config.xml")) {
			SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
			SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
			SqlSession sqlSession1 = sqlSessionFactory.openSession(true);
			CacheMapper mapper1 = sqlSession1.getMapper(CacheMapper.class);
			System.out.println(mapper1.getEmpById(1));
			sqlSession1.close();
			SqlSession sqlSession2 = sqlSessionFactory.openSession(true);
			CacheMapper mapper2 = sqlSession2.getMapper(CacheMapper.class);
			System.out.println(mapper2.getEmpById(1));
			sqlSession2.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
