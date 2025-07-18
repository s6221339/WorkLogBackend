package com.example.WorkLogBackend.vo.response;

import java.util.List;

import com.example.WorkLogBackend.constants.ResponseMessages;
import com.example.WorkLogBackend.vo.CustomerWithProjectVO;

public class ProjectCustomerInfoResponse extends BasicResponse 
{
	
	private List<CustomerWithProjectVO> infoList;

	public ProjectCustomerInfoResponse() {
		super();
	}

	public ProjectCustomerInfoResponse(int code, String message) {
		super(code, message);
	}

	public ProjectCustomerInfoResponse(ResponseMessages res) {
		super(res);
	}
	
	public ProjectCustomerInfoResponse(int code, String message, List<CustomerWithProjectVO> infoList) {
		super(code, message);
		this.infoList = infoList;
	}

	public ProjectCustomerInfoResponse(ResponseMessages res, List<CustomerWithProjectVO> infoList) {
		super(res);
		this.infoList = infoList;
	}

	public List<CustomerWithProjectVO> getInfoList() {
		return infoList;
	}
	
}
