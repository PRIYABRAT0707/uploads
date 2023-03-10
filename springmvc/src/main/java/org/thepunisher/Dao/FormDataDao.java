package org.thepunisher.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.thepunisher.model.FormData;

@Repository
public class FormDataDao {
	@Autowired
	private HibernateTemplate hiber;

	
	
	public HibernateTemplate getHiber() {
		return hiber;
	}



	public void setHiber(HibernateTemplate hiber) {
		this.hiber = hiber;
	}



	@Transactional
	public int insertData(FormData fd) {
		
		return (int) this.hiber.save(fd);
	}

}
