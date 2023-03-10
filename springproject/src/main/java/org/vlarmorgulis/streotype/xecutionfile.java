package org.vlarmorgulis.streotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class xecutionfile {
	
	public static void main(String [] args) {

		
		  ApplicationContext ss=new
		 ClassPathXmlApplicationContext("org/vlarmorgulis/streotype/streoanno.xml");
		 /* StudentFamily ds=ss.getBean("studentFamily",StudentFamily.class);
		 * System.out.println(ds); SpringExpressionLanguage
		 * uo=ss.getBean("noob",SpringExpressionLanguage.class);
		 * System.out.println(uo.getClass().hashCode()); SpringExpressionLanguage
		 * uo1=ss.getBean("noob",SpringExpressionLanguage.class);
		 * System.out.println(uo1.getClass().hashCode());
		 */
		
		 UsingSpringExpressionLanguage jno=ss.getBean("format", UsingSpringExpressionLanguage.class);
		 System.out.println(jno);
		 System.out.println(jno.getName());
		 System.out.println(jno.isAvilable());
	}

}
