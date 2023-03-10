package org.thepunisher.controller;

import org.apache.catalina.User;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;
import org.thepunisher.model.UserReg;

@Controller
public class PpandaController {
	
	@RequestMapping("/momo")
	public String mymeth() {
		
		return "open" ;
	}
	
	@RequestMapping(path = "/gog",method = RequestMethod.POST)
	public ModelAndView koppi(@ModelAttribute(name = "uu") UserReg uu,RedirectView vv,BindingResult res) {
		
		ModelAndView nn=new ModelAndView();
		/*
		 * if(!(res.hasErrors())) { nn.addObject("nn", nn); System.out.println(nn);
		 * nn.setViewName("suc"); } else { }
		 */
	return nn;
	}
	
	@RequestMapping("/error")
	public String error() {
		
		return "error";
	}
	

}
