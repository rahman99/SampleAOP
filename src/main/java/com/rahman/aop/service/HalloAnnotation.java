package com.rahman.aop.service;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class HalloAnnotation {
	
	@Pointcut("execution(* com.rahman.*Hallo.*(..))")
	private void selectAll(){}

	@AfterReturning(pointcut="selectAll()", returning="obj")
	public String getDataLogging(Object obj){
		return "Hallo logging data "+obj.toString();
	}
	
		
	@After("selectAll()")
	public void getAfterSample(){
		System.err.println("after define student");
	}
}
