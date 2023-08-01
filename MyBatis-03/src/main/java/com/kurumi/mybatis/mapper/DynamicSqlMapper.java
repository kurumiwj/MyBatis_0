package com.kurumi.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.kurumi.mybatis.entity.Emp;

public interface DynamicSqlMapper {
	//多条件查询
	List<Emp> getEmpByCondition(Emp emp);
	List<Emp> getEmpByCondition1(Emp emp);
	List<Emp> getEmpByCondition2(Emp emp);
	List<Emp> getEmpByChoose(Emp emp);
	//批量删除
	void deleteMore(@Param("eids") Integer[] eids);
	//批量添加
	void addMore(@Param("empList") List<Emp> empList);
}
