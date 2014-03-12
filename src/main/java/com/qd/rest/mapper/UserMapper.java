package com.qd.rest.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import com.qd.rest.entity.User;

@Repository(value = "userMapper")
public interface UserMapper {
	@Select("select * from user")
	public List<User> find();

	@Select("select * from user where id=#{id}")
	public User findById(int id);

	@Insert("insert into user(userName,password) values(#{userName},#{password})")
	public void saveUser(User user);

	@Update("update user set userName=#{userName},password=#{password}")
	public void updateUser(User user);

	@Delete("delete from user where id = #{id}")
	public void deteteUser(int id);
}
