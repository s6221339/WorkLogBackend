package com.example.WorkLogBackend.constants;

/**
 * 存放 Swagger API 說明文檔的類
 */
public final class ApiDocConstants 
{
	
	/* === API 簡介（@Operation#summary） === 
	 * === 命名格式：「API名稱_方法_SUMMARY」 === */
	public static final String GET_ALL_PROJECT_AND_CUSTOMER_SUMMARY = "取得所有專案與客戶資訊";

	
	/* === API 詳述（@Operation#description），每段末尾都需添加<br>換行 === 
	 * === 命名格式：「API名稱_方法_DESC」 === */
	public static final String GET_ALL_PROJECT_AND_CUSTOMER_DESC = "取得資料庫中所有客戶，並將其所屬專案一併整理後回傳<br>";
	
	/* === 請求資料規則，多條規則使用<ul>標籤 === 
	 * === 命名格式：「API名稱_請求資料名稱_REQUEST_BODY_RULE」 === */
	
	
	/* === 各種錯誤訊息，多條同代碼訊息使用<li>或<ol>包覆 === 
	 * === 同代碼訊息命名格式：「API名稱_方法_RESPONSE_代碼」格式 ===
	 * === 其他訊息格式：「任意，建議與 ResponseMessages 的變數名稱一致」 === */
	
	
	/* === 成功訊息 === */
	
	public final static String CREATE_SUCCESS = "新增成功";
	
	public final static String DELETE_SUCCESS = "刪除成功";
	
	public final static String UPDATE_SUCCESS = "更新成功";
	
	public final static String SEARCH_SUCCESS = "搜尋成功";
	
	/* === 測試狀態 === */

	public final static String NOT_TEST = "⚠️尚未進行任何測試";
	
	public final static String TEST_PASS = "⭕已通過測試";
	
	public final static String TEST_FAILED = "❌測試不通過";
	
	private ApiDocConstants() {}
	
}
