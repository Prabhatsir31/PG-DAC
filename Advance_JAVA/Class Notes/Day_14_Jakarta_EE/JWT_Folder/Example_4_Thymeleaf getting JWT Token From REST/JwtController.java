package com.example.demo;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JwtController 
{
	
	@Autowired
	private JwtUtil jwtutil;
	
	@Autowired
	private JwtRepository repository;
	
	@Autowired
	private CustomUserDetailsService customuserdetailsservice;
	
	@PostMapping("/token")
    public ResponseEntity<Map<String,String>> generateToken(@RequestParam String username, @RequestParam String password) {
		Map<String, String> response=null;
		try {
            MyUser user = new MyUser(username, password);
            System.out.println("inside token method");
            System.out.println(user);
            boolean result = repository.findUser(user);
            if (!result) {
                throw new UsernameNotFoundException("credentials don't match");
            }
            customuserdetailsservice.setPassword(user.getPassword());
            UserDetails userdetails = customuserdetailsservice.loadUserByUsername(user.getUsername());
            String token = this.jwtutil.generateToken(userdetails);
            System.out.println("JWT " + token);

            response = new HashMap<>();
            response.put("token", token);  // Wrap the JWT token in a JSON object

            return ResponseEntity.ok(response);  // Send JSON response
        } catch (Exception ee) {
            ee.printStackTrace();
            response.put("token","some error occured");
            return ResponseEntity.status(500).body(response);
        }
    }
}
