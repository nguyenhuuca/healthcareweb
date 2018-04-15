package com.canh.service;

import com.canh.model.User;

public interface UserService {
	public User findUserByEmail(String email);

	public void saveUser(User user);

}
