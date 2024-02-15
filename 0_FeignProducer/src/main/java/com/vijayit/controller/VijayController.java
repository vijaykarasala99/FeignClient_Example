package com.vijayit.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/vijay")
public class VijayController {

	@GetMapping("/name")
	public String getName() {
		return "VIJAY_KARASALA";
	}
	@GetMapping("/role")
	public String getRole() {
		return "JAVA FULL STACK DEVELOPER";
	}
	
}
