package org.thepunisher.controller;

import java.io.ObjectInputFilter.Config;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.thepunisher.Dao.FormDataDao;
import org.thepunisher.model.FormData;
import org.thepunisher.service.FormDataSerVice;

@Controller
public class FrontController {
	@Autowired
	private  FormDataSerVice fus;
	
	@RequestMapping("/")
	public String form() {
		
		return "form";
	}
//	@RequestMapping(path = "/formsub",method = RequestMethod.POST)
//	public ModelAndView  formData(@RequestParam("firstname") String firstname,
//			@RequestParam("surname")String surname,
//			@RequestParam("username") String username,
//			@RequestParam("password") String password,
//			@RequestParam("birthcity") String birthcity,@RequestParam("mobilenumber") String mobilenumber)
//	{
//		ModelAndView mm=new ModelAndView();
//		FormData fd=new FormData();
//		fd.setFirstname(firstname);
//		fd.setSurname(surname);
//		fd.setUsername(username);
//		fd.setPassword(password);
//		fd.setBirthcity(birthcity);
//		fd.setMobilenum(mobilenumber);
//		
//		mm.addObject("fd", fd);
//		mm.setViewName("getsuc");
//		return mm;
//	}
	
	@RequestMapping(path = "/formsub",method = RequestMethod.POST)
	public ModelAndView show(@ModelAttribute FormData fd) {
		ModelAndView gg=new ModelAndView();
		gg.addObject("fd", fd);
		gg.setViewName("getsuc");
		this.fus.createUser(fd);
		return gg;
	}

}
