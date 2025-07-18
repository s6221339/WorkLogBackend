package com.example.WorkLogBackend.service.itfc;

import com.example.WorkLogBackend.vo.response.ProjectCustomerInfoResponse;

public interface CustomerService
{
	
	/**
	 * 取得所有專案與客戶資訊，且專案資訊與客戶資訊相互綁定。
	 * @return 封裝專案資訊與客戶資訊的回應資料
	 */
	public ProjectCustomerInfoResponse getAllProjectAndCustomerInfomations();
	
}
