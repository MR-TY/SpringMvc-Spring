package com.ty.controller;


import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ty.service.UserService;

@Controller
public class UserController {
	@Resource
	private UserService userService;
	public UserController() {
		System.out.println("you are success");
	}
	@RequestMapping("/helloworld")
	public String test(){
		System.out.println("success");
		return "NewFile";
	}
}
