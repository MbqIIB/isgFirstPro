package com.isg.ifrend.web.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
public class LoginController {
	
//	@RequestMapping(value="/login.do",method=RequestMethod.GET)
//	public ModelAndView sayHello(Model model){
//		ModelAndView mv = new ModelAndView();
//		mv.setViewName("login");
//		model.addAttribute("welcomeMessage", "Hello Spring Security, I want to try you!");
//		return mv;
//	}

	
	 //@Autowired
	 //@Qualifier("flightService")
	 //private FlightService flightService;
	
	@RequestMapping(value="/login", method = RequestMethod.GET)
	public String login(ModelMap model) {
 
		return "login";
 
	}
	
	@RequestMapping(value="/loginfailed", method = RequestMethod.GET)
	public String loginerror(ModelMap model) {
 
		model.addAttribute("error", "true");
		return "login";
 
	}
 
	@RequestMapping(value="/logout", method = RequestMethod.GET)
	public String logout(ModelMap model) {
 
		return "login";
 
	}
	
//	@RequestMapping(value="/welcome", method = RequestMethod.GET)
//	public String printWelcome(ModelMap model, Principal principal ) {
// 
//		String name = principal.getName();
//		model.addAttribute("username", name);
//		model.addAttribute("message", "Spring Security Custom Form example");
//		
//		//model.addAttribute("specialDeals", flightService.getSpecialDeals());
//		
//		System.out.println("princial ---> : " + name);
//		
//		return "welcome";
// 
//	}
	
//	@RequestMapping(value="/welcome", method = RequestMethod.GET)
//	public String printWelcome(ModelMap model, Principal principal ) {
// 
//		String name = principal.getName();
//		model.addAttribute("username", name);
//		model.addAttribute("message", "Spring Security Custom Form example");
//		return "hello";
// 
//	}


}
