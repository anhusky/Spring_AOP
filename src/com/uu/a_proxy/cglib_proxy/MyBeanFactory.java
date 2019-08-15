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
		//1. 创建核心类
		Enhancer enhancer = new Enhancer();
		// 2. 绑定父类
		enhancer.setSuperclass(service.getClass());
		/*
		 * 3. 设置回调  
		 * 		MethodInterceptor 接口  等效 jdk INVocationHandler 接口
		 * 
		 *  intercept() 等效 jdk invoke()
		 *  	参数1,2,3  一样
		 *  	参数4 ： methodproxy 方法的代理
		 * 
		 */
		enhancer.setCallback(new MethodInterceptor() {
			
			public Object intercept(Object proxy, Method method, Object[] args,
					MethodProxy emthodProxy) throws Throwable {
				// 目标类的目标方法
				Object obj = method.invoke(service, args);

				System.out.println("------洗手-----");
				Object obj1 = emthodProxy.invokeSuper(proxy, args);
				System.out.println("------洗碗-----");

				return obj;
			}
		});
		
		return (UserServiceImp) enhancer.create();
	}
}
