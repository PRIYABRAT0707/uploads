package org.valarmorgulis.litspractice;


import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Executing {

	public static void main(String[] args) {
		
		ApplicationContext acc= new ClassPathXmlApplicationContext("org/valarmorgulis/litspractice/collection.xml");
		
		LaptopSpecs ls=(LaptopSpecs) acc.getBean("LaptopSpecs");
		System.out.println(ls.getLid());
		System.out.println(ls.getConnectedhardwares());
		System.out.println(ls.getInbuiltapps());
		System.out.println(ls.getKerneldetails());
		
		Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session ses=sf.openSession();
		Transaction tx=ses.beginTransaction();
//		ses.save(ls);
//		tx.commit();
		Query q=ses.createQuery("from LaptopSpecs");
		List<LaptopSpecs> lss=q.getResultList();
		for(LaptopSpecs ll:lss) {
			System.out.println(ll);
		}
		
		ses.close();
		sf.close();
		
		

	}

}
