package com.uu.c_spring_aop;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopTest {

	@Test
	public void Test() {

		String xmlPath = "com/uu/c_spring_aop/beans.xml";
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				xmlPath);
		UserService service = context.getBean("UserService",
				UserService.class);
		service.addUser();
		service.updateUser();
		service.deleteUser();
	}
}
