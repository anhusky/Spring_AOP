package com.uu.a_proxy.cglib_proxy;

import org.junit.Test;

public class CglibTest {

	@Test
	public void demo() {
		UserServiceImp proxyService = MyBeanFactory.createService();
		proxyService.eat();

	}
}
