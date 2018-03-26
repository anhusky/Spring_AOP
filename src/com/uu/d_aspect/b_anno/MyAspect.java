package com.uu.d_aspect.b_anno;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author liupenghao 切面类,含有多个通知
 */

@Component
@Aspect
public class MyAspect {
	
	@Pointcut("execution(public * com.uu.d_aspect.b_anno.UserServiceImp.*(..))")
	public void myPointCut(){
		
	}
	

	@After("myPointCut()")
	public void myAfter(JoinPoint joinPoint){
		System.out.println("最终通知");
	}
	
}
