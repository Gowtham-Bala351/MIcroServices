package com.ex.User.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/user")
public class UserController 
{
	@GetMapping("/get")
	public String getUser()
	{
		return "This is User controller!";
	}
}
