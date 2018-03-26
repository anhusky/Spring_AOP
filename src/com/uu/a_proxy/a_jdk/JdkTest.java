package com.uu.a_proxy.a_jdk;

import org.junit.Test;

public class JdkTest {

	@Test
	public void demo() {
		UserService proxyService = MyBeanFactory.createService();
		proxyService.addUser();
		proxyService.updateUser();
		proxyService.deleteUser();
	}
}
