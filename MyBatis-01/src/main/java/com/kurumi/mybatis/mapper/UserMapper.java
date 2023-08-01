package com.kurumi.mybatis.mapper;

import java.util.List;

import com.kurumi.mybatis.entity.User;

public interface UserMapper {
	//添加用户
	int addUser();
	//修改用户
	void updateUser();
	//删除用户
	void deleteUser();
	//根据id查询用户信息
	User getUserById();
	//查询所有的用户信息
	List<User> getAllUser();
}
