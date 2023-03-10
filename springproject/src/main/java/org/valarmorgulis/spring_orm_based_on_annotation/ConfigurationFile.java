package org.valarmorgulis.spring_orm_based_on_annotation;

import java.util.Properties;

import javax.sql.DataSource;
import javax.transaction.UserTransaction;

import org.hibernate.FlushMode;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.stereotype.Component;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.jta.JtaTransactionManager;
import org.springframework.transaction.jta.UserTransactionAdapter;

@Configuration
@EnableTransactionManagement
public class ConfigurationFile {


	@Bean("properties")
	public Properties getProperties() {
		Properties hh = new Properties();
		hh.setProperty("hibernate.dialect", "org.hibernate.dialect.Oracle10gDialect");
		hh.setProperty("hibernate.show_sql", "true");
		hh.setProperty("hibernate.hbm2ddl.auto", "update");

		return hh;
	}

	@Bean("dm")
	public DriverManagerDataSource getDataSource() {

		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		ds.setUrl("jdbc:oracle:thin:@localhost:1521:orcl");
		ds.setUsername("c##PPANDA");
		ds.setPassword("PPANDA");

		return ds;
	}

	@Bean("lsfb")
	public LocalSessionFactoryBean getLocalSessionFactoryBean() {

		LocalSessionFactoryBean foo = new LocalSessionFactoryBean();
		foo.setDataSource(getDataSource());
		foo.setHibernateProperties(getProperties());
		//foo.setAnnotatedClasses(org.valarmorgulis.spring_orm_based_on_annotation.DataModel.class);
		foo.setPackagesToScan("org.valarmorgulis.spring_orm_based_on_annotation");
		return foo;
	}
	
	@Bean("sessionfac")
	public SessionFactory getsessionFactory() {
		return getLocalSessionFactoryBean().getObject();
	}

	@Bean("HibernateTemplatel")
	public HibernateTemplate getHibernateTemplate() {
		HibernateTemplate go = new HibernateTemplate();
		go.setSessionFactory(getsessionFactory());
		go.setCheckWriteOperations(false);
		return go;
	}

	@Bean("dao")
	public DataModelDao operation() {
		DataModelDao dd = new DataModelDao();
		dd.setHibernateTemplatel(getHibernateTemplate());

		return dd;
	}
	
	@Bean("txnmanager")
	public HibernateTransactionManager getHibernateTransactionManager() {
		
		
		return new HibernateTransactionManager(getsessionFactory());
	}
	

}
