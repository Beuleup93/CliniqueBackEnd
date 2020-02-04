package com.clyn.sn.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.clyn.sn.entities.User;
import com.clyn.sn.service.IUserService;

@RestController
public class UserRestController {

	@Autowired
	private IUserService userService;
	
	@GetMapping("/users")
	public List<User> allUser(){
		return userService.findAllUser();
	}
	
	@DeleteMapping("/user/{id}")
	public boolean deleteUser(@PathVariable("id")Integer id) {
		return userService.deleteUser(id);
	}
	
	@GetMapping("/user/{id}")
	public User getUserById(@PathVariable("id")Integer id) {
		return userService.getOneUser(id);
	}
	
	@PostMapping("/user")
	public User saveUser(User user) {
		return userService.saveUser(user);
	}
	
	@PutMapping("/user")
	public User editUser(User user) {
		return userService.updateUser(user);
	}
}
