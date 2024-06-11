package com.love.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.love.model.UserRegisterDTO;

@Controller
public class RegistrationController {

	
	@RequestMapping("/register")
	public String showRegistrationPage(Model model) {
		UserRegisterDTO userRegisterDTO = new UserRegisterDTO();
		model.addAttribute("name",userRegisterDTO.getName());
		model.addAttribute("username",userRegisterDTO.getUsername());
		return "user-registration-page";
	}

}
