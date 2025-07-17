package com.example.WorkLogBackend.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Data;

@Entity
@Table(name = "job_category")
@Data
@Builder
public class JobCategory 
{
	
	@Id
	@Column(name = "category")
	private String category;
	
	@Id
	@Column(name = "job_item")
	private String jobItem;
	
}
