package com.in.skill.model;

import jakarta.persistence.Id;

public class Login {
	
	@Id
	private int Id;
	
	
	private String UserName;
	
	
	private String password;
	
}
