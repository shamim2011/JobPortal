package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Applications {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	
	// ✅ Many Applications -> 1 Job
	@ManyToOne
	Jobs job;
	
	// ✅ Many Applications -> 1 Applicant (User)
	@ManyToOne
	Users applicant;

	public Applications() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Applications(int id, Jobs job, Users applicant) {
		super();
		this.id = id;
		this.job = job;
		this.applicant = applicant;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Jobs getJob() {
		return job;
	}

	public void setJob(Jobs job) {
		this.job = job;
	}

	public Users getApplicant() {
		return applicant;
	}

	public void setApplicant(Users applicant) {
		this.applicant = applicant;
	}

	@Override
	public String toString() {
		return "Applications [id=" + id + ", job=" + job + ", applicant=" + applicant + "]";
	}
	
}
