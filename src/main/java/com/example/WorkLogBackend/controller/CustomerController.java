package com.example.WorkLogBackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.WorkLogBackend.constants.ApiDocConstants;
import com.example.WorkLogBackend.service.itfc.CustomerService;
import com.example.WorkLogBackend.vo.response.ProjectCustomerInfoResponse;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@CrossOrigin(allowedHeaders = "*")
@RequestMapping(value = "workLog/customer/")
@Tag(name = "客戶系統 API", description = "操作客戶系統的API")
public class CustomerController 
{
	
	@Autowired
	private CustomerService service;
	
	@PostMapping(value = "getAllProjectAndCustomer")
	@Operation(
			summary = ApiDocConstants.GET_ALL_PROJECT_AND_CUSTOMER_SUMMARY,
			description = ApiDocConstants.GET_ALL_PROJECT_AND_CUSTOMER_DESC
		)
		@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = ApiDocConstants.SEARCH_SUCCESS),
		})
	public ProjectCustomerInfoResponse getAllProjectAndCustomerInfomations()
	{
		return service.getAllProjectAndCustomerInfomations();
	}
	
}
