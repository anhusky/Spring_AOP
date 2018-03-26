package com.uu.d_aspect.a_xml;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class xmlTest {

	@Test
	public void demo() {
		String xmlPath = "com/uu/d_aspect/a_xml/beans.xml";
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				xmlPath);
		UserService service = context.getBean("userServiceId",
				UserService.class);
		service.addUser();
		service.updateUser();
		service.deleteUser();
	}
}
