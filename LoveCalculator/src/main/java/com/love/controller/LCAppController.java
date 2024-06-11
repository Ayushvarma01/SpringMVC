package com.love.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.love.model.UserInfoDTO;

@Controller
public class LCAppController {

	@RequestMapping("/")
	public String homePage() {
		return "home";
	}

	@RequestMapping("/process-homepage")
	public String showResultPage(UserInfoDTO userInfoDTO  ,Model model) {
		System.out.println(userInfoDTO.getUserName() +" "+userInfoDTO.getCrushName());
		model.addAttribute("userName",userInfoDTO.getUserName());
		model.addAttribute("crushName",userInfoDTO.getCrushName());
		return "process-homepage";
		
	}
	
	
}
