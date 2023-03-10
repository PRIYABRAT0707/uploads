package org.valarmorgulis.jdbcwithoutxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.valarmorgulis.springjdbc.MovieDao;
import org.valarmorgulis.springjdbc.MovieInfo;

import antlr.collections.List;

public class MyXecut {

	public static void main(String[] args) {
		
		ApplicationContext aaa=new AnnotationConfigApplicationContext(ConfigurationClass.class);
		
		 MovieDao jdd=aaa.getBean("omg", MovieDao.class);
		java.util.List<MovieInfo> mm=jdd.getMoviedetails();
		mm.forEach((x)->System.out.println(x.getMoname()+" --leadactor---> "+x.getLeadActor() +"  ---->leadactress--->"+x.getLeadActress()));
	
	}

}
