package com.neuedu.dao;

import com.neuedu.pojo.User;

public interface UserDao {
	public User getOne(String username);
	public int update(User user);
}
