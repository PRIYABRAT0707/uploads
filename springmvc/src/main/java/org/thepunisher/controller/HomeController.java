package org.thepunisher.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.thepunisher.model.Bird;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String home() {
		
		return "index";
	}
	@RequestMapping("/about")
	public String about(Model md) {
		Bird bd=new Bird(10,"peacock","black&blue",false,"india",40.87);
		md.addAttribute("bird", bd);
		
		return "about";
	}
	
	@RequestMapping("/need")
	public ModelAndView need() {
		ModelAndView mav=new ModelAndView();
		List<Bird> jjkr=new ArrayList<Bird>();
		jjkr.addAll(Arrays.asList(
				new Bird(101,"parrot","sky green",false,"india",10.87),
				new Bird(102,"ostrich","mixed khaki",false,"australia",11.87),
				new Bird(103,"crow","black",false,"uganda",12.87),
				new Bird(104,"piegion","grey",false,"rawanda",13.87),
				new Bird(105,"emu","grey&black",false,"philiphines",165.87),
				new Bird(106,"eagle","soil color",true,"peru",19.87),
				new Bird(107,"vulture","white&black",true,"ghana",187.87)
				));
		//mav.addObject("bod", new Bird(101,"parrot","sky green",false,"india",10.87));
		mav.addObject("bird", jjkr);
		mav.setViewName("need");
		
		return mav;
	}
	

}
