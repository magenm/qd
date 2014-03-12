package com.qd.rest.service;

import java.util.List;

import com.qd.rest.entity.User;

public interface IUserService {
	
	public List<User> find();
	
	public User findById(int id);
	
	public void saveUser(User user);
	
	public void updateUser(User user);
	
	public void deteteUser(int id);
}
