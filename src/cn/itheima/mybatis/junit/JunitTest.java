package cn.itheima.mybatis.junit;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.itheima.mybatis.mapper.UserMapper;
import cn.itheima.mybatis.pojo.User;

public class JunitTest {

	@Test
	public void testMapper() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserMapper userMapper = (UserMapper) ac.getBean("userMapper");
		User user = userMapper.findUserById(1);
		System.out.println(user);
	}

	@Test
	public void testMapper1() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserMapper userMapper = (UserMapper) ac.getBean(UserMapper.class);
		User user = userMapper.findUserById(22);
		System.out.println(user);
	}

}
