package com.example.WorkLogBackend.vo.request;

import com.example.WorkLogBackend.constants.ConstantsMessage;

import jakarta.validation.constraints.NotBlank;

public record CreateCustomerRequest(
		@NotBlank(message = ConstantsMessage.PARAM_ID_EMPTY_ERROR)
		String id,
		
		@NotBlank(message = ConstantsMessage.PARAM_NAME_EMPTY_ERROR)
		String name
		) {

}
