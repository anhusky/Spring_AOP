package com.uu.a_proxy.a_jdk;

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
		final MyAspect aspect = new MyAspect();
		
		
		UserService  proxyService = (UserService) Proxy.newProxyInstance(
				MyBeanFactory.class.getClassLoader(), 
				service.getClass().getInterfaces(), new InvocationHandler() {
					
					public Object invoke(Object proxy, Method method, Object[] args)
							throws Throwable {
						
						aspect.before();
						Object obj = method.invoke(service, args);
						aspect.after();
						
						return obj;
					}
				});
		
		
		return proxyService;
	}
}
