package com.zuul.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@RequestMapping("/a")
	public String y() {
		return "RestController de Zuul";
	}
	
	
	
	
	
	
}
