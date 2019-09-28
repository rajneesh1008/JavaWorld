package com.infosys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SecondController {
	
	@RequestMapping(path="/sc")
	public void msg() {
		System.out.println("we are in message");
	}

}
