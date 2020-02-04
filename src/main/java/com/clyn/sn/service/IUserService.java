package com.clyn.sn.service;

import java.util.List;

import com.clyn.sn.entities.User;

public interface IUserService {

	public List<User> findAllUser();
	public User saveUser(User user);
	public User updateUser(User user);
	public boolean deleteUser(Integer id);
	public User getOneUser(Integer id);
}
