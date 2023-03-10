package org.valarmorgulis.springjdbc;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class XecutionOfSpringJdbc {

	public static void main(String[] args) {
//		
		
		  ApplicationContext kk= new
		  ClassPathXmlApplicationContext("org/valarmorgulis/springjdbc/jdbcconc.xml");
		  MovieInfo mbb=kk.getBean("movieinfo",MovieInfo.class);
		 // System.out.println(mbb);
		 ApplicationContext aa=new ClassPathXmlApplicationContext("org/valarmorgulis/springjdbc/jdbcconc.xml");
		 MovieDao nn=aa.getBean("md",MovieDao.class);
		 
		 List<MovieInfo> klm=nn.getMoviedetails();
		 
		 klm.forEach((x)->System.out.println(x));
		 
		 
		 
		 
		 
		 
			/*
			 * int k= nn.insert(mbb); System.out.println("data insert successful " +k+
			 * " time");
			 */
			/*
			 * MovieInfo mm=nn.getinfo(11); System.out.println(mm);
			 */
//		MovieInfo mbb1=kk.getBean("movieinfo",MovieInfo.class);
//		System.out.println(mbb1.hashCode());
		/*
		 * // Configuration conf=new Configuration().configure("hibernate.cfg.xml");
		 * SessionFactory sf=conf.buildSessionFactory(); Session ses=sf.openSession();
		 * Transaction tc=ses.beginTransaction();
		 * 
		 * ApplicationContext kk= new
		 * ClassPathXmlApplicationContext("org/valarmorgulis/springjdbc/jdbcconc.xml");
		 * MovieInfo mbb=kk.getBean("movieinfo",MovieInfo.class); ses.save(mbb);
		 * tc.commit(); ses.close();
		 * 
		 * Session se=sf.openSession(); Transaction tt=se.beginTransaction(); Query
		 * q=se.createQuery("update MovieInfo set moname=:a where leadActor=:b");
		 * q.setParameter("a", "ddlj"); q.setParameter("b", "srk"); q.executeUpdate();
		 * tt.commit(); Query q1=se.createQuery("from MovieInfo"); List<MovieInfo>
		 * md=q1.getResultList(); for(MovieInfo mi:md) { System.out.println(mi); }
		 */
		
		
		//database operation using springjdbc
		
//		ApplicationContext acc= new ClassPathXmlApplicationContext("org/valarmorgulis/springjdbc/jdbcconc.xml");
//		JdbcTemplate jt=acc.getBean("moinfo",JdbcTemplate.class);
		
		//String q="insert into movieinfo values(?,?,?,?,?,?,?)";
		/*
		 * int result=jt.update(q,100,"kgf","yash","srinidhi","garuda","2023",1200);
		 * System.out.println("data updated" +result);
		 */
		//int sta=jt.update(q,mbb.getMoid(),mbb.getMoname(),mbb.getLeadActor(),mbb.getLeadActress(),mbb.getMainNegativeCharcter(),mbb.getYearOfRelease(),mbb.getLifetimeCollectionInCrore());
		//System.out.println("data updated: "+sta);
		
		/*
		 * String q="delete from movieinfo where moid=?"; int stat=jt.update(q, 100);
		 * System.out.println("why you delete "+stat+" time" );
		 */
		/*
		 * String qq="update  movieinfo set leadactor=? where moid=?"; int
		 * st=jt.update(qq, "srk uhmmmm",11);
		 * System.out.println("why did you update "+st+ " time");
		 */
		
		
		
		

	}

}
