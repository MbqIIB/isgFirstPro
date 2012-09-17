package com.isg.ifrend.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.isg.ifrend.web.model.Element;
import com.isg.ifrend.web.service.BizRulesManagerService;

@Controller
public class ElementController {

	@Autowired
	@Qualifier("elementService")
	private BizRulesManagerService elementService;
	
	@RequestMapping(value="/saveElement", method = RequestMethod.GET)
	public String loginerror(ModelMap model) {
 
		Element element = new Element();
		element.setElement_id(1);
		element.setFunction_id(1);
		element.setFormat("AAAxxx");
		element.setLength(7);
		element.setDescription("Account Balance");
		element.setAllowed_operators("GT");
		elementService.add(element);
		
		model.addAttribute("error", "true");
		return "welcome";
 
	}
	
	@RequestMapping(value="/insertElement", method = RequestMethod.POST)
	public String processSubmit(@ModelAttribute(value="Element") Element element,
			BindingResult result, Model model){
		
		System.out.println("element id: " + element.getElement_id());
		System.out.println("function id: " + element.getFunction_id());
		System.out.println("format: " + element.getFormat());
		System.out.println("length: " + element.getLength());
		System.out.println("Description: " + element.getDescription());
		System.out.println("Allowed operators: " + element.getAllowed_operators());
		elementService.add(element);
		
		
		model.addAttribute("element", element);
		
		return "newElement";
	}
	
	@RequestMapping(value="/insertElement", method = RequestMethod.GET)
	public String displayInsert(ModelMap model) {
 
		return "addElement";
 
	}
	
}
