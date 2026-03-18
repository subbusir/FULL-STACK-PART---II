package com.klu.Controller;
import org.springframework.beans.factory.annotation. Autowired; 
import org.springframework.web.bind.annotation. CrossOrigin; 
import org.springframework.web.bind.annotation. PostMapping; 
import org.springframework.web.bind.annotation. RequestBody; 
import org.springframework.web.bind.annotation. RestController;
import com.klu.model.User;
import com.klu.service.BackendOperations;
@RestController
@CrossOrigin("*")
public class EcommerceController {
@Autowired
private BackendOperations service;
@PostMapping("/Register")
public User registerUser (@RequestBody User user) {
return service.kluRegister(user);
}
}
