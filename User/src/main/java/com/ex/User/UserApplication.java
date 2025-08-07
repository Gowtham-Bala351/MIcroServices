package com.ex.User;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
public class UserApplication { 

	public static void main(String[] args) {
		SpringApplication.run(UserApplication.class, args);
	}
//	@GetMapping("/get")
//	public String getUser()
//	{
//		return "This is User !";
//	}
}
