package edu.com.mum.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class HomeController {

	@RequestMapping("/")
	public String welcome(Model model) {
		model.addAttribute("greeting", "Welcome to World's Best Shopping Store!");
		model.addAttribute("tagline", "Shop like you have never before!!");
		
		return "welcome";
	}
	

	
	
}
