package com.klu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@CrossOrigin("*")
public class KLUController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/app2/{cost}")
	public String finalPayment(@PathVariable double cost)
	{
		String url="http://RESTAPI-EX1/payment/"+cost;
		return restTemplate.getForObject(url, String.class);
	}

}
