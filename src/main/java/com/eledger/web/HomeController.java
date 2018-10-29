package com.eledger.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String root() {
    	System.out.println("root");
        return "index";
    }

    @GetMapping("/user")
    public String userIndex() {
    	System.out.println("user");
        return "dashbord";
    }

    @PostMapping("/login")
    public String login() {
    	System.out.println("login");
        return "dashbord";
    }

    @GetMapping("/access-denied")
    public String accessDenied() {
    	System.out.println("denied");
        return "/error/access-denied";
    }
    @GetMapping("/dashbord")
    public String dashbord() {
        return "/dashbord";
    }
    @GetMapping("/tables")
    public String tables() {
        return "/tables";
    }
    @GetMapping("/logout")
    public String logout() {
        return "/";
    }
    @GetMapping("/register")
    public String register() {
        return "/register";
    }
    
}
