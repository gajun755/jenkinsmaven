package com.app1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/app1")
public class HomeController {

	
	@GetMapping("/getDetails")
	public String getMessagefromAnotherService() {
		
		RestTemplate template=new RestTemplate();
		
		  String s=template.getForObject("http://localhost:8090/getmessage", String.class);
		return s;
	}
		
}
