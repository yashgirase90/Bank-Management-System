package com.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Model.User;
import com.Service.UserServiceImpliment;

@RestController
public class UserController {

	@Autowired
 
	UserServiceImpliment userServiceImpliment;

	
	@RequestMapping(value = "/u", method = RequestMethod.POST)
	public User saveUser(@RequestBody User user) {
		return userServiceImpliment.saveUser(user);
	}

	@GetMapping(value = "/admin/{id}")
	public User getUserByID(@PathVariable int id) {
		return userServiceImpliment.displayUser(id);
	}
 	
	@PostMapping(value = "/update/{id}")
	public String update(@PathVariable int id) {
		userServiceImpliment.updateUser(id);
		return "Number Will be updated .";
	}

	/*
	 * "adharNo":"581826327109", "fname":"Mahesh", "lname":"Bhonde",
	 * "email":"bhondemahesh2022@gmail.com", "mobile":"8806167271"
	 */    
	

	
}
