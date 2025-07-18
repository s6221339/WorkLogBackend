package com.example.WorkLogBackend.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.WorkLogBackend.constants.ResponseMessages;
import com.example.WorkLogBackend.dao.CustomerDao;
import com.example.WorkLogBackend.dao.ProjectDao;
import com.example.WorkLogBackend.entity.Customer;
import com.example.WorkLogBackend.entity.Project;
import com.example.WorkLogBackend.service.itfc.CustomerService;
import com.example.WorkLogBackend.vo.CustomerWithProjectVO;
import com.example.WorkLogBackend.vo.ProjectInfoVO;
import com.example.WorkLogBackend.vo.response.ProjectCustomerInfoResponse;

@Service
public class CustomerServiceImpl implements CustomerService 
{
	
	@Autowired
	private CustomerDao customerDao;
	
	@Autowired
	private ProjectDao projectDao;

	@Override
	public ProjectCustomerInfoResponse getAllProjectAndCustomerInfomations() 
	{
		List<Customer> allCustomer = customerDao.findAll();
		List<Project> allProject = projectDao.findAll();
		List<CustomerWithProjectVO> infoList = new ArrayList<>();
		for(Customer customer : allCustomer)
		{
			final String cusId = customer.getId();
			final String cusName = customer.getName();
			List<ProjectInfoVO> projList = allProject.stream()
					.filter(t -> t.getCustomerId().equals(cusId))
					.map(t -> new ProjectInfoVO(t.getId(), t.getName(), t.isCompleted()))
					.toList();
			CustomerWithProjectVO vo = new CustomerWithProjectVO(cusId, cusName, projList);
			infoList.add(vo);
		}
		infoList.sort((o1, o2) -> o1.customerId().compareTo(o2.customerId()));
		return new ProjectCustomerInfoResponse(ResponseMessages.SUCCESS, infoList);
	}

}
