package com.example.demo.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Users {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	String username;
	String password;
	String email;
	String full_name;
	String gender;
	String role;
	// Employer -> Jobs
	@OneToMany
	List<Jobs> job;
	// Applicant -> Applications
	@OneToMany
	List<Applications> app;
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Users(int id, String username, String password, String email, String full_name, String gender, String role,
			List<Jobs> job, List<Applications> app) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.email = email;
		this.full_name = full_name;
		this.gender = gender;
		this.role = role;
		this.job = job;
		this.app = app;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFull_name() {
		return full_name;
	}
	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public List<Jobs> getJob() {
		return job;
	}
	public void setJob(List<Jobs> job) {
		this.job = job;
	}
	public List<Applications> getApp() {
		return app;
	}
	public void setApp(List<Applications> app) {
		this.app = app;
	}
	@Override
	public String toString() {
		return "Users [id=" + id + ", username=" + username + ", password=" + password + ", email=" + email
				+ ", full_name=" + full_name + ", gender=" + gender + ", role=" + role + ", job=" + job + ", app=" + app
				+ "]";
	}
	
}
