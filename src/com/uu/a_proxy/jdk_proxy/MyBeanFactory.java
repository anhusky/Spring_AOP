package com.uu.a_proxy.jdk_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author liupenghao
 *  工场类，
 *  将目标类和切面类结合，生产代理类
 */
public class MyBeanFactory {


	public static UserService createService(){
		final UserServiceImp service = new UserServiceImp();

		return (UserService) Proxy.newProxyInstance(
				MyBeanFactory.class.getClassLoader(), service.getClass().getInterfaces(), new InvocationHandler() {

					/**
					 * @param proxy   代理类
					 * @param method  被代理方法
					 * @param args	  方法参数
					 * @return		  代理对象
					 * @throws Throwable
					 */
					public Object invoke(Object proxy, Method method, Object[] args)
							throws Throwable {

						System.out.println("------洗手-----");
						method.invoke(service, args);
						System.out.println("------洗碗-----");
						
						return proxy;
					}
				});
	}
}
