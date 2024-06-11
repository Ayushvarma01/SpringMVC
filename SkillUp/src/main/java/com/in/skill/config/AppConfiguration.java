package com.in.skill.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class AppConfiguration extends AbstractAnnotationConfigDispatcherServletInitializer {

	public AppConfiguration() {
		System.out.println("AppConfiguration");
	}

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
//		return new Class<?>[] {ORMConfiguration.class};
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub

		return new Class<?>[] { DispatcherConfig.class };
	}

	@Override
	protected String[] getServletMappings() {
		// mapping for Dispatcher servlet
		return new String[] { "/" };
	}

}