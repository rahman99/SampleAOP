package com.rahman.aop.service;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
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

	/**
	 * keyword within di pakai jika ingin execution semua method yang ada pada class yang disebutkan
	 */
	@Pointcut("within(com.rahman.aop.model.Circle)")
	public void getAllCircle(){}
	
	/**
	 * getAllCircle dibawah adalah memanggil execution yang ada pada method getAllCircle.
	 * sehingga tidak perlu lagi menuliskan execution lagi berkali kali yang memungkinkan terjadi kesalahan
	 */
	@Before("getAllCircle()")
	public void beforeGetAllCircle(JoinPoint joinPoint){
		System.err.println("get log before data circle");
		
		Circle c = (Circle)joinPoint.getTarget();
		System.err.println(c.getArea());
	}
	
	/**
	 * jika ingin memanggil args jangan lupa sertakan juga class execution yang akan di pakai
	 */
	@Before("getAllCircle() && args(name)")
	public void stringArgumentMethod(String name){
		System.err.println("demo String argument has been called. values: "	+name);
	}
	
	/**
	 * jika menggunakan @After maka command di dalam method akan tetap dieksekusi. 
	 * namun jika menggunakan @afterReturning maka tidak akan di eksekusi. 
	 * sebenarnya, @after dan @afterReturning jika tidak ada error hasilnya akan sama saja.
	 */
	@AfterReturning("getAllCircle() && args(name)")
	public void afterArgsMethod(String name){
		System.err.println("demo after args argument with values: "+name);
	}
	
	/**
	 * @afterReturning hanya di eksekusi jika terjadi error saja.
	 * jika tidak terjadi error, maka tidak di exsekusi.
	 */
	@AfterThrowing("getAllCircle() && args(name)")
	public void throwsReturnArgs(String name){
		System.err.println("the exception error is in "+name);
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
