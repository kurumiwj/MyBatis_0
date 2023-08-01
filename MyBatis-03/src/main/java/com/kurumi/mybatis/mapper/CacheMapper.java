package com.kurumi.mybatis.mapper;

import org.apache.ibatis.annotations.Param;

import com.kurumi.mybatis.entity.Emp;

public interface CacheMapper {
	Emp getEmpById(@Param("eid") Integer eid);
}
