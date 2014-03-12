package com.qd.rest.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.qd.rest.entity.User;
import com.qd.rest.service.IUserService;

@RestController
public class RestControllerDemo {

	@Resource(name = "userService")
	private IUserService userService;

	@RequestMapping(value = "/userList", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	public List<User> getUser() {
		System.out.println("222");
		List<User> userList = userService.find();
		System.out.println("userList:"+userList);
		return userList;
	}
	
	@RequestMapping(value = "/addUser", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	public void addUser() {
		System.out.println("addUser");
	}

	@RequestMapping(value = "/springcontent.htm", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	public String getUserHtml() {
		// Test HTML view
		return "example";
	}

}
