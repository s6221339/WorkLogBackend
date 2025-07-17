package com.example.WorkLogBackend.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Data;

@Entity
@Table(name = "work_team")
@Data
@Builder
public class WorkTeam 
{
	
	@Id
	@Column(name = "id")
	private String id;

}
