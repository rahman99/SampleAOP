package com.rahman.aop;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.rahman.aop.bean.BeanConfiguration;
import com.rahman.aop.model.Shape;
import com.rahman.aop.model.Student;
import com.rahman.aop.service.AspectConfig;
import com.rahman.aop.service.HalloAnnotation;
import com.rahman.aop.service.HalloService;

@SpringBootApplication
public class SampleAopApplication implements CommandLineRunner{
	
//	@Autowired
//	private HalloService hallo;
//	
//	@Autowired
//	private HalloAnnotation halloAnnotate;

	public static void main(String[] args) {
		SpringApplication.run(SampleAopApplication.class, args);
	}
	
	@Override
	public void run(String... arg0) throws Exception {
		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		Shape shape = ctx.getBean("shape", Shape.class);
//		shape.getShapeTriangle().getName();
//		shape.getShapeCircle().setName("dummy name");
		shape.getShapeCircle().getCircleOtherShape("unShape");
	}

	/*@Override
	public void run(String... arg0) throws Exception {
//		System.err.println("welcome : "+this.hallo.getMessageStatus());		
//		System.err.println("welcome "+halloAnnotate.getDataLogging("rahman"));
		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AspectConfig.class);
		
		Student s = ctx.getBean("student", Student.class);
//		s.getId();
		s.getName();
		
	}*/
}
