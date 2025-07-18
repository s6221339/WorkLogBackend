package com.example.WorkLogBackend.constants;

/**
 * 存放著各式各樣ㄉ回應訊息與代碼
 */
public enum ResponseMessages 
{
	// 需按照以下分隔分類訊息，其他代碼除了 200，應從小到大依序排列
	// CODE = 400
	
	// CODE = 403
	
	// CODE = 404
	
	// CODE = 500
	
	// CODE = 200
	SUCCESS(200, "成功！");
	
	private int code;
	
	private String message;

	private ResponseMessages(int code, String message) 
	{

		this.code = code;
		this.message = message;
	}

	public int getCode() {
		return code;
	}

	public String getMessage() {
		return message;
	}
	
}
