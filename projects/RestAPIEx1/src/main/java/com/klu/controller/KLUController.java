package com.klu.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class KLUController {
	@GetMapping("/payment/{cost}")
	public String getAmount(@PathVariable double cost)
	{
		return "Final Price ..."+cost;
	}

}
