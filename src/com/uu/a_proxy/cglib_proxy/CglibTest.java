package com.uu.a_proxy.cglib_proxy;

import org.junit.Test;

public class CglibTest {

	@Test
	public void demo() {
		UserService proxyService = MyBeanFactory.createService();
		proxyService.addUser();
		//proxyService.updateUser();
		//proxyService.deleteUser();
	}
}
