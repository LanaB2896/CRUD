package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.example.demo.model.User;
import com.example.demo.service.Customer;


@Controller
public class HomeController {
	@Autowired
	private Customer customer;
	@RequestMapping(value="/read", method= RequestMethod.GET)
	public  @ResponseBody List<User> read()
	{
		return customer.findAll();
				
	}
	
	@RequestMapping(value="/insertValue",method = RequestMethod.POST)
	public @ResponseBody User insert(@RequestParam("customerCode")Integer customerCode,@RequestParam("customerName")String customerName,
			@RequestParam("customerAddress")String customerAddress,@RequestParam("customerPincode")String customerPincode,
			@RequestParam("customerEmail")String customerEmail,
			@RequestParam("customerNumber")String customerNumber, @RequestParam("registrationDate")String registrationDate,
			@RequestParam("createdBy")String createdBy, @RequestParam("modifiedBy")String modifiedBy)
	{
		User user = new User();
		user.setCustomerCode(customerCode);
		user.setCustomerName(customerName);
		user.setCustomerAddress(customerAddress);
		user.setCustomerPincode(customerPincode);
		user.setCustomerEmail(customerEmail);
		user.setCustomerNumber(customerNumber);
		user.setRegistrationDate(registrationDate);
		user.setCreatedBy(createdBy);
		user.setModifiedBy(modifiedBy);
		return customer.save(user);
	}
	
	@RequestMapping(value = "/deleteValue/{customerID}", method = RequestMethod.DELETE)
	public @ResponseBody void delete(@PathVariable("customerID") int customerID)
	{
	customer.deleteById(customerID);
	}
	
	@RequestMapping(value = "/updateValue/{customerID}", method = RequestMethod.POST)
	public  @ResponseBody User  update(Model model,@PathVariable("id") int id,@RequestParam("customerCode")Integer customerCode,
			@RequestParam("customerName")String customerName,@RequestParam("customerAddress")String customerAddress,
			@RequestParam("customerPincode")String customerPincode,@RequestParam("customerEmail")String customerEmail,
			@RequestParam("customerNumber")String customerNumber, @RequestParam("registrationDate")String registrationDate,
			@RequestParam("createdBy")String createdBy,@RequestParam("modifiedBy")String modifiedBy)
	{
		
		User user = new User();
		user.setCustomerCode(customerCode);
		user.setCustomerName(customerName);
		user.setCustomerAddress(customerAddress);
		user.setCustomerPincode(customerPincode);
		user.setCustomerEmail(customerEmail);
		user.setCustomerNumber(customerNumber);
		user.setRegistrationDate(registrationDate);
		user.setCreatedBy(createdBy);
		user.setModifiedBy(modifiedBy);
		return customer.save(user);
	}
	
	
	
	
}
