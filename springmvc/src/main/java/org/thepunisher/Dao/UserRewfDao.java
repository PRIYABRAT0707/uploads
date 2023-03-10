package org.thepunisher.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.thepunisher.model.UserReg;

@Repository
public class UserRewfDao {
	@Autowired
	private HibernateTemplate hiber;

	
	
	public HibernateTemplate getHiber() {
		return hiber;
	}



	public void setHiber(HibernateTemplate hiber) {
		this.hiber = hiber;
	}
	
	@Transactional
	public int insert1(UserReg ur) {
		
		return (int) this.hiber.save(ur);
	}

}
