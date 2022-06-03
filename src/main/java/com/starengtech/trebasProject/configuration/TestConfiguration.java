package com.starengtech.trebasProject.configuration;

import com.starengtech.trebasProject.entities.Message;
import com.starengtech.trebasProject.entities.MessageType;
import com.starengtech.trebasProject.entities.User;
import com.starengtech.trebasProject.repositories.MessageRepository;
import com.starengtech.trebasProject.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
//"test" deve ter mesma notação utilizada em package: src/main/resources -> application.properties
public class TestConfiguration implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private MessageRepository messageRepository;

	@Override
	public void run(String... args) throws Exception{

		User u1 = new User(null,"Thiago");
		User u2 = new User(null,"Bavleen");
		User u3 = new User(null,"Gurnoor");
		User u4 = new User(null,"Nancy");


		userRepository.saveAll(Arrays.asList(u1, u2, u3, u4));

		//------------

		Message msg1 = new Message(null,"Test a new message", MessageType.HOME,u1);
		Message msg2 = new Message(null,"Test a new message", MessageType.JOB,u2);
		Message msg3 = new Message(null,"Test a new message", MessageType.OTHER,u3);
		Message msg4 = new Message(null,"Test a new message", MessageType.SCHOOL,u4);

		messageRepository.saveAll(Arrays.asList(msg1, msg2, msg3, msg4));

	}
	
}
