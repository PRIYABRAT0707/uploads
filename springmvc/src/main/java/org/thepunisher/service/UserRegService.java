package org.thepunisher.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.thepunisher.model.UserReg;

@Service
public class UserRegService {
	
	@Autowired
	private org.thepunisher.Dao.UserRewfDao UserRewfDao;

	public org.thepunisher.Dao.UserRewfDao getUserRewfDao() {
		return UserRewfDao;
	}

	public void setUserRewfDao(org.thepunisher.Dao.UserRewfDao userRewfDao) {
		UserRewfDao = userRewfDao;
	}
	
	public int insertinto(UserReg hh) {
		
		return this.UserRewfDao.insert1(hh);
		
	}

}
