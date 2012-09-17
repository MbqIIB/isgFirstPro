package com.isg.ifrend.web.controller;

import java.util.Collections;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {

	
	@RequestMapping(value="/welcome",method=RequestMethod.GET)
	public ModelAndView sayHello(Model model){
		
		//Collections.synchronizedList(list)
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("welcome");
		model.addAttribute("welcomeMessage", "Hello Spring Security, I want to try you!");
		return mv;
	}
	
	
	
}
