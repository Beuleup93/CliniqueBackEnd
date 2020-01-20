package com.clyn.sn.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.clyn.sn.entities.User;
import com.clyn.sn.service.IUserService;

@RestController
public class UserRestController {

	@Autowired
	private IUserService userService;
	
	@RequestMapping(method=RequestMethod.GET)
	public List<User> allUser(){
		return userService.findAllUser();
	}
	
	/*
	 * @RequestMapping(value = "/{ref}",method=RequestMethod.GET) public Classe
	 * getContactByRef(@PathVariable("ref")String ref){ return
	 * classeRepository.findOne(ref); }
	 * 
	 * @RequestMapping(value = "/save",method=RequestMethod.POST) public Classe
	 * saveContact(@RequestBody Classe c){ return classeRepository.save(c); }
	 * 
	 * @RequestMapping(value = "/update",method=RequestMethod.PUT) public Classe
	 * updateContact(@RequestBody Classe c){ return
	 * classeRepository.saveAndFlush(c); }
	 * 
	 * @RequestMapping(value = "/delete/{ref}", method = RequestMethod.DELETE)
	 * public boolean deleteContact(@PathVariable("ref") String id){
	 * classeRepository.delete(id); return true; }
	 */
}
