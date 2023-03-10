package org.valarmorgulis.jdbcwithoutxml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.valarmorgulis.springjdbc.MovieDao;

@Configuration
public class ConfigurationClass {
	
	@Bean("datacon")
	public DriverManagerDataSource getDataSource() {
		
		DriverManagerDataSource ds=new DriverManagerDataSource();
		ds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		ds.setUrl("jdbc:oracle:thin:@localhost:1521:orcl");
		ds.setUsername("c##PPANDA");
		ds.setPassword("PPANDA");
		
		return ds;
	}
	
	@Bean("jtt")
	public JdbcTemplate getTemplate() {
		JdbcTemplate jd=new JdbcTemplate();
		jd.setDataSource(getDataSource());
		return jd;
	}
	
	@Bean("omg")
	public MovieDao newMethod() {
		 MovieDao mff=new  MovieDao();
		 
		 mff.setJtt(getTemplate());
		 
		 return mff;
	}
	

}
