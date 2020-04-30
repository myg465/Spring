package com.myg.javalec.ex.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testcontroller {
	@GetMapping("/")
	public String index() {
		return "demo project__";
	}
	
}
