package org.valarmorgulis.spring_orm_based_on_annotation;

import java.io.Serializable;
import java.util.ArrayList;

import org.hibernate.SessionFactory;
import org.hibernate.mapping.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.orm.hibernate5.HibernateTransactionManager;



public class MyMainClass {
	
	
	public static void main(String [] args) {
		ApplicationContext jjj=new AnnotationConfigApplicationContext( ConfigurationFile.class);
		
		
		/*
		 * DataModel jj=new DataModel(367,"identity",7000,68000,3,"green",500);
		 * 
		 * DataModelDao jo=(DataModelDao) jjj.getBean("dao"); int k=jo.insertInto(jj);
		 * System.out.println(k);
		 */
		 
		/*
		 * SessionFactory ses=(SessionFactory) jjj.getBean("sessionfac");
		 * ses.openSession();
		 */
		//DataModelDao jo=(DataModelDao) jjj.getBean("dao");
		/*
		 * DataModel ff=jo.getdata(367); System.out.println(ff);
		 */
		 
		DataModelDao jo=(DataModelDao) jjj.getBean("dao");
		ArrayList<DataModel> jum=new ArrayList<DataModel>();
	         jum=(ArrayList<DataModel>) jo.gatListFromDM(67);
	         jum.forEach((x)->System.out.println(x));
		
	}
}
