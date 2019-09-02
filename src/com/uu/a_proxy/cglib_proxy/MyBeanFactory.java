package com.uu.a_proxy.cglib_proxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author liupenghao
 *  工场类，
 *  将目标类和切面类结合，生产代理类  ,使用Cglib  字节码代理
 */
public class MyBeanFactory {
	
	
	public static UserServiceImp createService(){
		final UserServiceImp service = new UserServiceImp();

		
		// cglib 使用
		//1. 增强因子，cglib核心类
		Enhancer enhancer = new Enhancer();
		// 2. 绑定父类
		enhancer.setSuperclass(service.getClass());
		/*
		 * 3. 设置回调  
		 * 		MethodInterceptor  		方法拦截器
		 *
		 */
		enhancer.setCallback(new MethodInterceptor() {

			/**
			 * @param proxy  	  代理对象
			 * @param method	  被代理对象的方法
			 * @param args		  方法参数
			 * @param emthodProxy 代理对象的方法（可以看做是子类对象）
			 * @return			  代理对象
			 * @throws Throwable
			 */
			public Object intercept(Object proxy, Method method, Object[] args, MethodProxy emthodProxy) throws Throwable {
				// 目标类的目标方法
				System.out.println("------洗手-----");
				// method.invoke(service,args);
				emthodProxy.invokeSuper(proxy, args);
				System.out.println("------洗碗-----");

				return proxy;
			}
		});
		
		return (UserServiceImp) enhancer.create();
	}
}
