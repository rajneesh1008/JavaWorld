package com.cognizant.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class WelcomeController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String method = request.getMethod();
		if (method.equals("POST")) {
			ModelAndView mav = new ModelAndView("welcome");
			return mav;
		} else {
			return new ModelAndView("error");
		}

	}
}