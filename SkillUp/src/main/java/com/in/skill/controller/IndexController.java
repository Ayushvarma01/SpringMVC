package com.in.skill.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.in.skill.model.Customer;
import com.skill.dao.CustomerDAO;

@Controller
public class IndexController {

	@Autowired
	CustomerDAO customerDAO; 
	
	@RequestMapping("/")
	public String loginPage() {
		System.out.println("login");
		return "login";
	}
	
	
	@RequestMapping("/getlogin")
	public String getlogin() {
		System.out.println("getlogin");
		return "login";
	}
	
	@RequestMapping("/addCust")
	public String addCust(Customer customer, Model model) {
		customerDAO.addCustomer(customer);
		return "login";
	}
}
