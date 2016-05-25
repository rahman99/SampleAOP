package com.rahman.aop.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import com.rahman.aop.model.Circle;
import com.rahman.aop.model.Shape;
import com.rahman.aop.model.Triangle;
import com.rahman.aop.service.ShapeAspect;

@Configuration
@EnableAspectJAutoProxy
public class BeanConfiguration {
	
	@Bean(name="triangle")
	public Triangle triangle(){
		Triangle t = new Triangle();
		t.setName("triangle shape");
		t.setArea("30 ca");
		return t;
	}
	
	@Bean(name="circle")
	public Circle circle(){
		Circle c = new Circle();
		c.setName("circle shape");
		c.setArea("50 ca");
		return c;
	}
	
	@Bean(name="shape")
	public Shape shape(){
		Shape s = new Shape();
		s.setCirle(circle());
		s.setTriangle(triangle());
		return s;
	}
	
	@Bean(name="shapeAspect")
	public ShapeAspect shapeAspect(){
		return new ShapeAspect();
	}
}
