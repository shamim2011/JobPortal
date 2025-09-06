package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.Users;
import com.example.demo.service.UsersService;

@Controller
public class UsersController {

	@Autowired
	UsersService userv;
	
	@PostMapping("/register")
	public String addUsers(@ModelAttribute Users user) {
		if(userv.emailExists(user.getEmail())==false) {
			String msg = userv.addUsers(user);
			return msg;
		}
		return "existUser";
	}
	@PostMapping("/login")
	public String validateUser(@RequestParam String email,@RequestParam String password) {
		boolean login_status = userv.validateUser(email, password);
		if(login_status==true) {
			return "home"; // login successfull show all job list
		}
		return "loginFail";
	}
}
