package org.valarmorgulis.referencevariable;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Xecution {
	
	public static void main(String [] args) {
		ApplicationContext acu=new ClassPathXmlApplicationContext("org/valarmorgulis/referencevariable/reference.xml");
		Car cc=(Car) acu.getBean("car");
		System.out.println(cc.getMb());
		System.out.println(cc);
		
	}

}
