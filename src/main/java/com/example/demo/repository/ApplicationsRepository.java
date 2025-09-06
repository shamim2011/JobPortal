package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Applications;

public interface ApplicationsRepository extends JpaRepository<Applications,Integer>{

}
