package com.klu.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@CrossOrigin("*")
public class KLUController {
 @GetMapping("/req1")
 public String req1() {
  return "req1 !!!";
  }
 @GetMapping("/req2")
 public String req2() {
  return "req2 !!!";
  }
 @GetMapping("/req3")
 public String req3() {
  return "req3 !!!";
  }
}