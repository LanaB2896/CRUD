package com.springboot.demo.controller;



import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springboot.demo.model.CustomerDetails;
import com.springboot.demo.service.CustomerLogic;

@Controller
public class CustomerController {
	@Autowired
	private CustomerLogic customerLogic;
@RequestMapping(value="/add", method= RequestMethod.GET)

public String read(CustomerDetails customerDetails)
//public String read()

{
	return "CustomerList";
}

@RequestMapping(value="/add", method=RequestMethod.POST)
 public String read(@Valid @ModelAttribute("customerDetails")CustomerDetails customerDetails,BindingResult bindingResult, Model model)
 {
	if(bindingResult.hasErrors())
	{
		return "CustomerList";
	}
	customerLogic.fromUI(customerDetails);
	//model.addAttribute("insert", customerDetails);
	//model.addAttribute("insert", customerLogic.details());
	customerLogic.details(model);
	return "hai";
	
 }

}
