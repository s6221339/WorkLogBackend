package com.example.WorkLogBackend.vo;

import java.util.List;

public record CustomerWithProjectVO(
		String customerId,
		String customerName,
		List<ProjectInfoVO> projectInfoList
		) {

}
