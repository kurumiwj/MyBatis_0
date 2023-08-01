package com.kurumi.mybatis.mapper;

import org.apache.ibatis.annotations.Param;

import com.kurumi.mybatis.entity.Dept;

public interface DeptMapper {
	//通过分步查询员工以及员工所对应的部门信息
	Dept getEmpAndDept1(@Param("did") Integer did);
	//获取部门以及部门中所有员工对象
	Dept getDeptAndEmp(@Param("did") Integer did);
	//分步查询部门以及部门中所有的员工信息
	Dept getDeptAndEmp1(@Param("did") Integer did);
}
