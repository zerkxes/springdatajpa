package com.aniket.springjpa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.aniket.springjpa.entity.User;
//import com.aniket.springjpa.service.UserDAOService;
import com.aniket.springjpa.service.UserRepository;
@Component
public class UserRepositoryCommandLineRunner implements CommandLineRunner {

	private static final Logger log= LoggerFactory.getLogger(UserRepositoryCommandLineRunner.class);
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {

		User user=new User("Jill", "Admin");
		userRepository.save(user);
		log.info("NEW USER CREATED IS: "+user);
	}

}
