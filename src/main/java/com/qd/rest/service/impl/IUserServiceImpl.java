package com.qd.rest.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.qd.rest.entity.User;
import com.qd.rest.mapper.UserMapper;
import com.qd.rest.service.IUserService;

@Repository(value = "userService")
@Transactional
public class IUserServiceImpl implements IUserService {

	@Resource(name = "userMapper")
	private UserMapper userMapper;

	@Override
	public List<User> find() {
		// TODO Auto-generated method stub
		return userMapper.find();
	}

	@Override
	public User findById(int id) {
		// TODO Auto-generated method stub
		return userMapper.findById(id);
	}

	@Override
	public void saveUser(User user) {
		// TODO Auto-generated method stub
		userMapper.saveUser(user);
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		userMapper.updateUser(user);
	}

	@Override
	public void deteteUser(int id) {
		// TODO Auto-generated method stub
		userMapper.deteteUser(id);
	}

}
