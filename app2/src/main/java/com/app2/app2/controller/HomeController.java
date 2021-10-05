package com.app2.app2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	
	@GetMapping("/getmessage")
	public String getMessage() {
		
		return "Service app2";
	}
	
}
