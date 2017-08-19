package com.zls.dao;


import org.mybatis.spring.annotation.MapperScan;

import com.zls.pojo.User;

@MapperScan
public interface UserDao {
	public User getUser(int id);
}