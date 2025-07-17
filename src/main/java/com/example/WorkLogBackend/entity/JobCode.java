package com.example.WorkLogBackend.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Data;

@Entity
@Table(name = "job_code")
@Data
@Builder
public class JobCode 
{
	
	@Id
	@Column(name = "code")
	private String code;
	
	@Column(name = "name")
	private String name;
	
}
