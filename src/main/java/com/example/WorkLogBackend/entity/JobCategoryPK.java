package com.example.WorkLogBackend.entity;

import java.io.Serializable;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@EqualsAndHashCode
@ToString
public class JobCategoryPK implements Serializable 
{

	private static final long serialVersionUID = 6288712437376202045L;
	
	private String category;
	
	private String jobItem;

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getJobItem() {
		return jobItem;
	}

	public void setJobItem(String jobItem) {
		this.jobItem = jobItem;
	}
	
}
