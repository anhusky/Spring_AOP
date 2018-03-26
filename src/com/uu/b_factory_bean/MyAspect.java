package com.uu.b_factory_bean;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;


/**
 * @author liupenghao 切面类
 */
public class MyAspect implements MethodInterceptor{

	public Object invoke(MethodInvocation mi) throws Throwable {
		
		System.out.println("前3");
		Object obj = mi.proceed();
		System.out.println("后3");
		return obj;
	}
	


}
