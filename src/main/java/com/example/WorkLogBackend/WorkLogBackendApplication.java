package com.example.WorkLogBackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.scheduling.annotation.EnableScheduling;

//因為有使用 spring-boot-starter-security 此依賴，要排除預設的基本安全性設定(帳密登入驗證)
//排除帳密登入驗證就是加上 exclude = SecurityAutoConfiguration.class
//等號後面若有多個 class 時，就要用大括號，一個時大括號可有可無
@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
@EnableScheduling
public class WorkLogBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(WorkLogBackendApplication.class, args);
	}

}
