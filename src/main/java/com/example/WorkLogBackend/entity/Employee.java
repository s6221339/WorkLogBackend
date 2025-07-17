package com.example.WorkLogBackend.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Data;

@Entity
@Table(name = "employee")
@IdClass(value = EmployeePK.class)
@Data
@Builder
public class Employee 
{
	
	@Id
	@Column(name = "id")
	private String id;
	
	@Id
	@Column(name = "name")
	private String name;
	
	@Column(name = "work_team")
	private String workTeam;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "employed")
	private boolean employed;
	
}
