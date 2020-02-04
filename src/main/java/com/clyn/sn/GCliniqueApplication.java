package com.clyn.sn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.clyn.sn.dao.UserRepository;
import com.clyn.sn.entities.User;

@SpringBootApplication
public class GCliniqueApplication implements CommandLineRunner{

	@Autowired
	private UserRepository userRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(GCliniqueApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/*
		 * User u1 =userRepository.save(new User("NDAO", "Saliou", "saliou@gmail.com",
		 * "SNDAO", "zale@gmail.com", true)); User u2 =userRepository.save(new
		 * User("SECK", "Momo", "momo@gmail.com", "MSECK", "momo@gmail.com", true));
		 */
	}

}
