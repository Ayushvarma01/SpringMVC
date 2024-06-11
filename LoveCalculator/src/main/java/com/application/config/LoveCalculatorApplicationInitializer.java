package com.application.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class LoveCalculatorApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	public LoveCalculatorApplicationInitializer() {
		System.out.println("Web.Xml Configuration in Java");
	}
	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		
		return new Class<?>[] {MyConfigurationFile.class};
	}

	@Override
	protected String[] getServletMappings() {
		// mapping for Dispatcher servlet
		return new String[] { "/" };
	}

}
