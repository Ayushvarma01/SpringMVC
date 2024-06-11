package com.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/sis")
public class SisController {

	@ResponseBody
	@RequestMapping("/makeup")
	public String getMakeupKit() {
		return "give take my make up kit";
	}

//	@ResponseBody
	@RequestMapping("/books")
	public String getBooks() {
//		return "Math book";
		System.out.println("Hit");
		return "MRFCricketbat";
	}
}
