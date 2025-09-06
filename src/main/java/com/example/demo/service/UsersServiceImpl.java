package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Users;
import com.example.demo.repository.UsersRepository;

@Service
public class UsersServiceImpl implements UsersService{
	@Autowired
	UsersRepository urepo;
	
	@Override
	public String addUsers(Users user) {
		urepo.save(user);
		return "registerSuccess";
	}

	@Override
	public boolean emailExists(String email) {
		if(urepo.findByEmail(email)==null) {
			return false;
		}
		return true;
	}

	@Override
	public boolean validateUser(String email, String password) {
		Users user = urepo.findByEmail(email);
		String db_pass = user.getPassword();
		if(db_pass.equals(password)) {
			return true;
		}
		return false;
	}

}
