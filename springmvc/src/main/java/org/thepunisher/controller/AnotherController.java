package org.thepunisher.controller;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;
import org.thepunisher.model.UserReg;

@Controller
public class AnotherController {
	
	@Autowired
	private org.thepunisher.service.UserRegService UserRegService;
	
	
	@RequestMapping("/cf")
	public String complexForm() {
		
		return "complexform";
	}
	
	@RequestMapping(path = "/form",method = RequestMethod.POST)
	public String complexFormHandler(@ModelAttribute("urr") UserReg ur,BindingResult res) {
		
		
		if(res.hasErrors()) {
		
			return "complexform";
		}
		int k=UserRegService.insertinto(ur);
		System.out.println("successfully done " +k+ " time");
		return "";
	}
	
	@RequestMapping("/file")
	public String fileupload() {
		
		return "fileupload";
	}
	
	@RequestMapping(value = "/upload",method = RequestMethod.POST)
	
	public  String  filecon(@RequestParam("file1") CommonsMultipartFile cmf,Model mod,HttpSession hh) {
	byte [] bb=cmf.getBytes();
	mod.addAttribute("file1", cmf);
	//System.out.println(hh.getServletContext().getContextPath());
	String path=hh.getServletContext().getRealPath("/")+"jo.jpg";
	System.out.println(path);
	
	try {
		
		FileOutputStream ff=new FileOutputStream(path);
		ff.write(bb);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
		
	
		return "showme";
	}
	
	
	

}
