package org.valarmorgulis.autowiring.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ano3 {

	public static void main(String[] args) {
		ApplicationContext cob=new ClassPathXmlApplicationContext("org/valarmorgulis/autowiring/annotation/annotation.xml");
		ano2 vo=(ano2) cob.getBean("book");
		System.out.println(vo);
		

	}

}
