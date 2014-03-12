package com.qd.rest.po;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.qd.rest.entity.User;

@Repository(value = "userMapper")
public interface UserMapper {
	@Select(value = "${sql}")
	public List<User> find(@Param(value = "sql") String sql);
}
