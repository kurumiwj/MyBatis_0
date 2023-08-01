package com.kurumi.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.kurumi.mybatis.entity.Emp;
import com.kurumi.mybatis.utils.SqlSessionUtils;

public class EmpMapperTest {
	@Test
	public void testGetAllEmp() {
		SqlSession sqlSession = SqlSessionUtils.getSqlSession();
		EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
		List<Emp> empList = mapper.getAllEmp();
		empList.forEach(System.out::println);
	}
	@Test
	public void testGetEmpAndDept() {
		SqlSession sqlSession = SqlSessionUtils.getSqlSession();
		EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
		Emp emp = mapper.getEmpAndDept(1);
		System.out.println(emp);
	}
	@Test
	public void testGetEmpAndDept1() {
		SqlSession sqlSession = SqlSessionUtils.getSqlSession();
		EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
		Emp emp = mapper.getEmpAndDept1(1);
		System.out.println(emp.getEmpName());
	}
}
