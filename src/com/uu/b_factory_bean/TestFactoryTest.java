package com.uu.b_factory_bean;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestFactoryTest {

	@Test
	public void Test() {

		String xmlPath = "com/uu/b_factory_bean/beans.xml";
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				xmlPath);
		UserService service = context.getBean("proxyServiceId",
				UserService.class);
		service.addUser();
		service.updateUser();
		service.deleteUser();
	}
}
