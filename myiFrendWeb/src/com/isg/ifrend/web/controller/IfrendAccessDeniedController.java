package com.isg.ifrend.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class IfrendAccessDeniedController {
	
	@RequestMapping(value="/accessDenied",method=RequestMethod.GET)
	public String accessDenied(){
		
		return "accessDenied";
		
	}

}
