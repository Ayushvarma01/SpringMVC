package com.application.config; 

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan("com.love.controller")
public class MyConfigurationFile {

	
	public MyConfigurationFile() {
		System.out.println("Front Controller or Dispatcher-servlter.xml Configurtion ");
	}
	
	@Bean
	public InternalResourceViewResolver internalResourceViewResolver() {
		//set Prefix and Suffix
		return new InternalResourceViewResolver("/WEB-INF/views/",".jsp");
	}
}
