package com.clyn.sn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.clyn.sn.dao.UserRepository;
import com.clyn.sn.entities.User;

@Service
@Transactional
public class IUserServiceImpl implements IUserService{

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public List<User> findAllUser() {
		return userRepository.findAll();
	}

	@Override
	public User saveUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public void updateUser(User user) {
		userRepository.save(user);
		
	}

	@Override
	public void deleteUser(User user) {
		userRepository.delete(user); 
	}

}
