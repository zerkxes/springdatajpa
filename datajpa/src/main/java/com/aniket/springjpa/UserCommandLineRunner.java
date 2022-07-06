package com.aniket.springjpa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.aniket.springjpa.entity.User;
import com.aniket.springjpa.service.UserDAOService;
@Component
public class UserCommandLineRunner implements CommandLineRunner {

	private static final Logger log= LoggerFactory.getLogger(UserCommandLineRunner.class);
	@Autowired
	private UserDAOService userDaoService;
	
	@Override
	public void run(String... args) throws Exception {

		User user=new User("Jack", "Admin");
		long insert = userDaoService.insert(user);
		log.info("NEW USER CREATED IS: "+user);
	}

}
