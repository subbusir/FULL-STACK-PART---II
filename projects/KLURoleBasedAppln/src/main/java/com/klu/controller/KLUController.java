package com.klu.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class KLUController {

	@GetMapping("/")
	public String home() {
		return "welcome to klu !!!";
	}
	
	@GetMapping("/admin")                      		//http://localhost:8080/admin    admin, admin
	public String admin() {
		return "welcome to admin";
	}
	
	@GetMapping("/user")							//http://localhost:8080/user     user, user
	public String user() {
		return "welcome to user";
	}
}
