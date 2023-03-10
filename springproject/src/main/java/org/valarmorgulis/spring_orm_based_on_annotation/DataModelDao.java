package org.valarmorgulis.spring_orm_based_on_annotation;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;
import org.hibernate.query.Query;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AdviceMode;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Isolation;


public class DataModelDao {

	private HibernateTemplate HibernateTemplatel;

	public HibernateTemplate getHibernateTemplatel() {
		return HibernateTemplatel;
	}

	public void setHibernateTemplatel(HibernateTemplate hibernateTemplatel) {
		HibernateTemplatel = hibernateTemplatel;
	}
	
	@org.springframework.transaction.annotation.Transactional()
	public int insertInto(DataModel dm) {
		
	 return (int) this.HibernateTemplatel.save(dm);
	 }
		
	public DataModel getdata(int id) {
		
		return this.HibernateTemplatel.get(DataModel.class, id);
	}

	//DataModel gg=new DataModel();
	public List<DataModel> gatListFromDM(int id){
		List<DataModel> lance=new ArrayList<DataModel>();
		lance=(List<DataModel>) this.HibernateTemplatel.find("from  dmm" );
		
		return lance;
	}
	
	
	
}
