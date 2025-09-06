package com.example.demo.service;

import com.example.demo.entity.Users;

public interface UsersService {
	public String addUsers(Users user);
	
	public boolean emailExists(String email);
	
	public boolean validateUser(String email,String password);
}
