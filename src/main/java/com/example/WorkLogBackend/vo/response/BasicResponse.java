package com.example.WorkLogBackend.vo.response;

import com.example.WorkLogBackend.constants.ResponseMessages;

/**
 * 所有回應封裝訊息的基礎。
 */
public class BasicResponse 
{
	
	private int code;
	
	private String message;
	
	public BasicResponse() {
		super();
	}
	
	/**
	 * 除非有特殊自定義狀況，否則不建議使用該建構子
	 * @param code 回應碼
	 * @param message 回應訊息
	 * @see {@link BasicResponse#BasicResponse(ResponseMessages)}
	 */
	public BasicResponse(int code, String message) {
		super();
		this.code = code;
		this.message = message;
	}
	
	/**
	 * 建議使用該建構子，可大幅縮短代碼並提升可讀性
	 * @param res 封裝回傳訊息
	 */
	public BasicResponse(ResponseMessages res)
	{
		code = res.getCode();
		message = res.getMessage();
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "{code: " + code + ", message: '" + message + "'}";
	}
	
}
