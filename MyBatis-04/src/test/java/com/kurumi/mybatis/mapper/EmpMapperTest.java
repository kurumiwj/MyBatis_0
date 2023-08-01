package com.kurumi.mybatis.mapper;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kurumi.mybatis.entity.Emp;
import com.kurumi.mybatis.entity.EmpExample;

public class EmpMapperTest {
	@Test
	public void test() {
		try {
			InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
			SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
			SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
			SqlSession sqlSession = sqlSessionFactory.openSession(true);
			EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
//			List<Emp> empList = mapper.selectByExample(null);
//			empList.forEach(System.out::println);
			EmpExample empExample = new EmpExample();
//			empExample.createCriteria().andEmpNameEqualTo("admin");
			empExample.createCriteria().andDidEqualTo(1).andAgeGreaterThan(19);
			empExample.or().andSexEqualTo("女");
			List<Emp> empList = mapper.selectByExample(empExample);
			empList.forEach(System.out::println);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test
	public void testPageHelper() {
		try {
			InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
			SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
			SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
			SqlSession sqlSession = sqlSessionFactory.openSession(true);
			EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
			PageHelper.startPage(2,2);
			List<Emp> empList = mapper.selectByExample(null);
			PageInfo<Emp> pageInfo=new PageInfo<>(empList,3);
			empList.forEach(emp->System.out.println(emp));
			System.out.println(pageInfo);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
