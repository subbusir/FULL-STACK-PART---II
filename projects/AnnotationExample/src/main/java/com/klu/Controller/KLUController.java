package com.klu.Controller;

import com.klu.model.Login;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class KLUController {

    @GetMapping("/req1")
    public String req1() {
        return "req1";
    }

    @GetMapping("/req2/{msg}")
    public String req2(@PathVariable String msg) {
        return "Welcome to " + msg;
    }

    @GetMapping("/req3")
    public String req3(@RequestParam(required = true) String name) {
        return "Welcome to " + name;
    }

    @GetMapping("/req4")
    public String req4(@RequestHeader("token") String token) {
        if (token.equals("kluklu")) {
            return "Hello, Authentication Success";
        } else {
            return "Hello, Authentication Fail";
        }
    }

    @GetMapping("/req5")
    public String req5(@RequestParam String username,
                       @RequestParam String password,
                       @RequestHeader("token") String token) {
        if (token.equals("kluklu")) {
            if (username.equals("admin") && password.equals("admin@123")) {
                return "Login Success";
            } else {
                return "Login Fail !!!";
            }
        } else {
            return "Authentication Fails !!!";
        }
    }

    @PostMapping("/login")
    public String login(@RequestBody Login login) {
        if (login.getUsername().equals("klu") && login.getPassword().equals("klu@123")) {
            return "Login Success";
        } else {
            return "Login Fail";
        }
    }
}
