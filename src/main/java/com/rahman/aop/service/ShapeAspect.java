package com.rahman.aop.service;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.joda.time.DateTime;
import org.springframework.stereotype.Component;

import com.rahman.aop.model.Circle;

@Component
@Aspect
public class ShapeAspect {
	
	DateTime dt = new DateTime();

	@Pointcut("within(com.rahman.aop.model.Circle)")
	public void getAllCircle(){}
	
	@Before("getAllCircle()")
	public void beforeGetAllCircle(JoinPoint joinPoint){
		System.err.println("get log before data circle");
		
		Circle c = (Circle)joinPoint.getTarget();
		System.err.println(c.getArea());
	}
		
	@Before("execution(public String getName())")
	public void loggingAdvanceBefore(){
		System.err.println(dt.toString("HH:mm:ss:SSSS")+" get before advance logging be called");
	}
	
	@After("execution(*  getShape*())")
	public void loggingAdvanceAfter(){
		System.err.println(dt.toString("HH:mm:ss:SSSS")+" get after advance logging be called");
	}
}
