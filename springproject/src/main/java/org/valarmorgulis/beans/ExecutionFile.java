package org.valarmorgulis.beans;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ExecutionFile {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("firstspring.xml");
		MobileSpecs ms=(MobileSpecs) context.getBean("mobilespecs");
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session ses=sf.openSession();
		Transaction tx=ses.beginTransaction();
		ses.save(ms);
		tx.commit();
		ses.close();
		sf.close();
	
		//System.out.println(ms);

	}

}
