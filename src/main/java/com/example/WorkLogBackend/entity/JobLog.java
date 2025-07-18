package com.example.WorkLogBackend.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "job_log")
public class JobLog 
{
	
	@Id
	@Column(name = "id")
	private int id;
	
	@Column(name = "employee_id")
	private String employeeId;
	
	@Column(name = "employee_name")
	private String employeeName;
	
	@Column(name = "work_team")
	private String workTeam;
	
	@Column(name = "customer_id")
	private String customerId;
	
	@Column(name = "project_id")
	private String projectId;
	
	@Column(name = "category")
	private String category;
	
	@Column(name = "job_item")
	private String jobItem;
	
	@Column(name = "date")
	private LocalDate date;
	
	@Column(name = "working_hours")
	private double workingHours;
	
	@Column(name = "description")
	private String description;
	
}
