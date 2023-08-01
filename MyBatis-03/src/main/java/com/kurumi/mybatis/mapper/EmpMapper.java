package com.kurumi.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.kurumi.mybatis.entity.Emp;

public interface EmpMapper {
	/*
	 * 字段名和实体类的属性名不一致：
	 * 	为字段起别名
	 * 	在核心配置文件中设置一个全局配置信息mapUnderscoreToCamelCase
	 * */
	//查询所有员工信息
	List<Emp> getAllEmp();
	//查询员工以及员工所对应的部门信息
	Emp getEmpAndDept(@Param("eid") Integer eid);
	//通过分步查询员工以及员工所对应的部门信息
	Emp getEmpAndDept1(@Param("eid") Integer eid);
	//分步查询部门以及部门中所有的员工信息
	List<Emp> getDeptAndEmp1(@Param("did") Integer did);
}
