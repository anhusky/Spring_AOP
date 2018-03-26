package com.uu.d_aspect.b_anno;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnoTest {

	@Test
	public void demo() {
		String xmlPath = "com/uu/d_aspect/b_anno/beans.xml";
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				xmlPath);
		UserService service = context.getBean("userServiceId",
				UserService.class);
		service.addUser();
		service.updateUser();
		service.deleteUser();
	}
}
