package com.home.mycafe.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class myCafeControllers {

	@RequestMapping("/cafe")
	public String Welcome(Model model) {
		String name = "Ayush1234";
		
		model.addAttribute("MyName", name);
		
		return "welcome-page";
	}
	
	@RequestMapping("/order")
	public String getorder(HttpServletRequest request, Model model) {
		String order = request.getParameter("food");
		model.addAttribute("userOrder",order);
		System.out.println("hit order");
		return "order";
	}
}
