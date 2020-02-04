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
	public User updateUser(User user) {
		return userRepository.saveAndFlush(user);
		
	}

	@Override
	public boolean deleteUser(Integer id) 
	{
		if(getOneUser(id) != null) {
			userRepository.deleteById(id);
			return true;
		}
		  
		  return false;
	}

	@Override
	public User getOneUser(Integer id) {
		
		return userRepository.getOne(id);
	}

}
