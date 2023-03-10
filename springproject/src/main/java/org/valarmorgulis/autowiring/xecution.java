package org.valarmorgulis.autowiring;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class xecution {
	public static void main(String [] args) {
		AbstractApplicationContext cc=new ClassPathXmlApplicationContext("org/valarmorgulis/autowiring/autowiring.xml");
		book book=(book) cc.getBean("book");
		System.out.println(book);
		cc.registerShutdownHook();
		
//		notebook nb=(notebook) cc.getBean("note");
//		System.out.println(nb);
		
		Configuration cfg= new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session se=sf.openSession();
		Transaction tx=se.beginTransaction();
		se.save(book);
		tx.commit();
		se.close();
		sf.close();
		
		
	}

}
