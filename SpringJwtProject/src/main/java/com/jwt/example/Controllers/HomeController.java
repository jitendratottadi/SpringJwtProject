package com.jwt.example.Controllers;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jwt.example.Services.UserService;
import com.jwt.example.model.User;


@RestController
@RequestMapping("/home")
public class HomeController {
	
	@Autowired
	private UserService userService;
	
	
	@GetMapping("/users")
	public List<User> getUser() {
		
		System.out.println("getting users");
		return userService.getUsers();
	}
	
	@GetMapping("/loggedinuser")
	public String getLoggedInUser(Principal principal) {
		
		return principal.getName();
	}

}
