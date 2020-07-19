package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.RegisterEntity;
import com.example.demo.service.RegisterServiceImpl;

@RestController
public class RegisterController {
	
	@Autowired
	RegisterServiceImpl registerService;
	
	 @RequestMapping(value= "/register", method= RequestMethod.POST)
	    public boolean registerUser(@RequestBody RegisterEntity register) {
		 return registerService.registerClient(register);
	        
	    }

	 @RequestMapping(value= "/login", method= RequestMethod.GET)
	    public boolean loginUser(@RequestParam String email, @RequestParam String password) {
		 return registerService.loginClient(email,password);
	        
	    }

}
