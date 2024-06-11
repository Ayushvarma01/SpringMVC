package com.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BroController {

	public BroController() {
		System.out.println("HomeController initialized");
	}

	@RequestMapping("/index")
	public String giveCricketBat() {
		System.out.println("hit");
		return "index";
	}
}
