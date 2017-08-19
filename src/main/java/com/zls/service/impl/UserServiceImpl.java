package com.zls.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zls.dao.UserDao;
import com.zls.pojo.User;
import com.zls.service.IUserService;
@Service("userService")
public class UserServiceImpl implements IUserService {
	@Resource
	private UserDao userDao;
	public User getUser(int id) {
		return userDao.getUser(id);
	}

}
