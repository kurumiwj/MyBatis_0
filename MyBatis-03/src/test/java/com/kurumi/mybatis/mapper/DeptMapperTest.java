package com.kurumi.mybatis.mapper;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.kurumi.mybatis.entity.Dept;
import com.kurumi.mybatis.utils.SqlSessionUtils;

public class DeptMapperTest {
	@Test
	public void testGetDeptAndEmp() {
		SqlSession sqlSession = SqlSessionUtils.getSqlSession();
		DeptMapper mapper = sqlSession.getMapper(DeptMapper.class);
		Dept dept = mapper.getDeptAndEmp(1);
		System.out.println(dept);
	}
	@Test
	public void testGetDeptAndEmp1() {
		SqlSession sqlSession = SqlSessionUtils.getSqlSession();
		DeptMapper mapper = sqlSession.getMapper(DeptMapper.class);
		Dept dept = mapper.getDeptAndEmp1(1);
		System.out.println(dept.getDeptName());
	}
}
