package com.example.WorkLogBackend.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.WorkLogBackend.entity.Project;

public interface ProjectDao extends JpaRepository<Project, String> 
{
	
	
	
}
