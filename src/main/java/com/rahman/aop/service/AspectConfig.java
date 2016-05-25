package com.rahman.aop.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.rahman.aop.model.Student;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages="com.rahman.aop")
public class AspectConfig {
	
	@Bean(name="haloAnnotation")
	public HalloAnnotation getAspect(){
//		HalloAnnotation h = new HalloAnnotation();
//		h.getBeforeSample();
//		h.getAfterSample();
//		return h;
		return new HalloAnnotation();
	}
	
	@Bean(name="student")
	public Student getDataStudent(){
		Student s = new Student();
//		s.setId(112);
		s.setName("rahman");
		return s;
	}
	
	
}
