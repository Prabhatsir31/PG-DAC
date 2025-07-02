package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WelcomeController {

    @GetMapping("/welcome")
    public String welcome(@RequestParam String token, Model model) {
        System.out.println("inside welcome controller");
    	model.addAttribute("token", token);  // You can add the token to the model if needed
        return "welcome";  // Thymeleaf will automatically look for templates/welcome.html
    }
}
