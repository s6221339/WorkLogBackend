package com.example.WorkLogBackend.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.WorkLogBackend.entity.Customer;

import jakarta.transaction.Transactional;

@Repository
public interface CustomerDao extends JpaRepository<Customer, String> 
{
	
	@Transactional
	@Modifying
	@Query(value = "insert into customer (id, name) values (?1, ?2)", nativeQuery = true)
	public void create(String id, String name);
	
}
