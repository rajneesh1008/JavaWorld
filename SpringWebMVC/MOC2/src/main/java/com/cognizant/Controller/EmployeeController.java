package com.cognizant.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class EmployeeController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String userName="Anil";
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("emp");
		request.setAttribute("uname",userName);
		return modelAndView;
	}

}
