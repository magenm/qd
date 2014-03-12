package com.qd.rest.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.qd.rest.entity.User;
import com.qd.rest.po.UserMapper;
import com.qd.rest.service.IUserService;

@Repository(value = "userService")
@Transactional
public class IUserServiceImpl implements IUserService {

	@Resource(name = "userMapper")
	private UserMapper userMapper;

	@Override
	public List<User> find() {
		// TODO Auto-generated method stub
		String sql = "select * from user";
		return userMapper.find(sql);
	}

}
