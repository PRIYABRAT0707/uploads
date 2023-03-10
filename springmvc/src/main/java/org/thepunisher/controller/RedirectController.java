package org.thepunisher.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RedirectController {
	
	@RequestMapping("/one")
	public String one() {
		System.out.println("first contoller");
		return "redirect:two";
	}
	
	@RequestMapping("/two")
	public String two() {
		System.out.println("2nd controller");
		return "";
	}

}
