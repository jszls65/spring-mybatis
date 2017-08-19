package com.zls.test;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alibaba.fastjson.JSON;
import com.zls.pojo.User;
import com.zls.service.IUserService;

import junit.framework.TestCase;

public class TestMyBatis  extends TestCase  {
	private static Logger logger = Logger.getLogger(TestMyBatis.class);
	private ApplicationContext ac = null;
	@Resource
	private IUserService userService = null;

	

	@Test
	public void test1() {
		ac = new ClassPathXmlApplicationContext("spring-mybatis.xml");
		userService = (IUserService) ac.getBean("userService");
		User user = userService.getUser(2);
		logger.info(JSON.toJSONString(user));
	}
}