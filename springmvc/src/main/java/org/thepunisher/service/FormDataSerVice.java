package org.thepunisher.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.thepunisher.model.FormData;

@Service
public class FormDataSerVice {
	
	@Autowired
	private org.thepunisher.Dao.FormDataDao FormDataDao;

	public org.thepunisher.Dao.FormDataDao getFormDataDao() {
		return FormDataDao;
	}

	public void setFormDataDao(org.thepunisher.Dao.FormDataDao formDataDao) {
		FormDataDao = formDataDao;
	}
	
	public int createUser(FormData fd) {
		
		return this.FormDataDao.insertData(fd);
		
		
	}

}
