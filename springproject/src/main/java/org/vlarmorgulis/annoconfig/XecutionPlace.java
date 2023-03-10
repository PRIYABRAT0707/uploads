package org.vlarmorgulis.annoconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XecutionPlace {

	public static void main(String[] args) {
		ApplicationContext acc=new AnnotationConfigApplicationContext(javaconfig.class);
		
		MovieData md=acc.getBean("ppanda",MovieData.class);
		System.out.println(md);
		
		
	}

}
