package com.kurumi.mybatis.mapper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.kurumi.mybatis.entity.Emp;
import com.kurumi.mybatis.utils.SqlSessionUtils;

public class DynamicSqlMapperTest {
	@Test
	public void testGetEmpByCondition() {
		SqlSession sqlSession = SqlSessionUtils.getSqlSession();
		DynamicSqlMapper mapper = sqlSession.getMapper(DynamicSqlMapper.class);
		Emp emp = new Emp(null,"",20,null,null,null);
//		List<Emp> empList = mapper.getEmpByCondition(emp);
//		List<Emp> empList = mapper.getEmpByCondition1(emp);
		List<Emp> empList = mapper.getEmpByCondition2(emp);
		empList.forEach(System.out::println);
	}
	@Test
	public void testGetEmpByChoose() {
		SqlSession sqlSession = SqlSessionUtils.getSqlSession();
		DynamicSqlMapper mapper = sqlSession.getMapper(DynamicSqlMapper.class);
		Emp emp = new Emp(null,"",null,null,null,null);
		List<Emp> empList = mapper.getEmpByChoose(emp);
		empList.forEach(System.out::println);
	}
	@Test
	public void testDeleteMore() {
		SqlSession sqlSession = SqlSessionUtils.getSqlSession();
		DynamicSqlMapper mapper = sqlSession.getMapper(DynamicSqlMapper.class);
		mapper.deleteMore(new Integer[] {6,7,8});
	}
	@Test
	public void testAddMore() {
		SqlSession sqlSession = SqlSessionUtils.getSqlSession();
		DynamicSqlMapper mapper = sqlSession.getMapper(DynamicSqlMapper.class);
		List<Emp> empList=new ArrayList<>();
		Emp[] emps=new Emp[] {new Emp(null,"kurumi",19,"女","kurumi@126.com",1),new Emp(null,"kurumi",20,"女","kurumi@126.com",2),new Emp(null,"kurumi",21,"女","kurumi@126.com",3)};
		empList.addAll(Arrays.asList(emps));
		mapper.addMore(empList);
	}
}
