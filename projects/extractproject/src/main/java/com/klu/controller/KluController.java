package com.klu.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.klu.model.Headphones;
import com.klu.model.Laptops;
import com.klu.model.Login;
import com.klu.model.Mobiles;
import com.klu.service.KLUService;

@RestController
@CrossOrigin("*")
public class KluController 
{
  @Autowired
  private KLUService service;
  
  @GetMapping("/laptops")
  public List<Laptops> displayAllLaptops()
  {
    return service.getAllLaptops();
  }
  
  @GetMapping("/mobiles")
  public List<Mobiles> displayAllMobiles()
  {
    return service.getAllMobiles();
  }
  
  @GetMapping("/headphones")
  public List<Headphones> displayAllHeadphones()
  {
    return service.getAllHeadphones();
  }
  
  @GetMapping("/laptops/{pid}")
  public Optional<Laptops> getLaptopById(@PathVariable Long pid) {
    return service.getLaptopById(pid);
  }
  @GetMapping("/mobiles/{pid}")
  public Optional<Mobiles> getMobilesById(@PathVariable Long pid) {
    return service.getMobileById(pid);
  }
  
  @GetMapping("/headphones/{pid}")
  public Optional<Headphones> getHeadphonesById(@PathVariable Long pid) {
    return service.getHeadphonesById(pid);
  }
  
 
  @PostMapping("/login")
	public Map<String, String> login(@RequestBody Login login) {
	    // Fetch the Login object from the service
	    Login fetchedLogin = service.loginByUsername(login.getUsername());

	    // Prepare the response map
	    Map<String, String> response = new HashMap<>();
	    if (fetchedLogin != null && fetchedLogin.getPassword().equals(login.getPassword())) {
	        response.put("login", "success");
	    } else {
	        response.put("login", "fail");
	    }
	    return response;
	}

}