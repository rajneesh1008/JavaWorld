package com.infosys.utils;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class MOCInitializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		AnnotationConfigWebApplicationContext container=new AnnotationConfigWebApplicationContext();
		container.register(MOCUtil.class);
		DispatcherServlet dispatcherServlet = new DispatcherServlet(container);
		Dynamic servlet = servletContext.addServlet("spring",dispatcherServlet);
		servlet.setLoadOnStartup(1);
		servlet.addMapping("/");
		
		
	}

}
