package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

	@Controller
	public class HomeController {

	   @GetMapping("/test") 
	    public String home(Model model) {
	        model.addAttribute("title", "Home Page");
	        model.addAttribute("welcomeMessage", "Welcome to Thymeleaf MVC!");
	        return "home";
	    }
	    @GetMapping("/wel")
	    public String welcome(Model model) {
	        model.addAttribute("title", "welcome Page");
	        model.addAttribute("welcomeMessage", "Welcome to Thymeleaf MVC!");
	        return "welcome";
	    }
	}



