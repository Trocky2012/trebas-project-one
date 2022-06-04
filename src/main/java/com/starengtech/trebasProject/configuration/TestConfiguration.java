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

		User u1 = new User(null,"Ajay");
		User u2 = new User(null,"Bavleen");
		User u3 = new User(null,"Kajal");
		User u4 = new User(null,"Nancy");
		User u5 = new User(null,"Navjot");
		User u6 = new User(null,"Gurnoor");
		User u7 = new User(null,"Raymond");
		User u8 = new User(null,"Santiago");
		User u9 = new User(null,"Thiago");


		userRepository.saveAll(Arrays.asList(u1, u2, u3, u4, u5, u6, u7, u8, u9));

		//------------

		Message msg1 = new Message(null,"Test a new message user 1 - other", MessageType.HOME,u1);
		Message msg2 = new Message(null,"Test a new message user 2", MessageType.JOB,u2);
		Message msg3 = new Message(null,"Test a new message user 3", MessageType.OTHER,u3);
		Message msg4 = new Message(null,"Test a new message user 4", MessageType.SCHOOL,u4);
		Message msg5 = new Message(null,"Test a new message user 5", MessageType.HOME, u5);
		Message msg6 = new Message(null,"Test a new message user 6", MessageType.SCHOOL,u6);

		Message msg7 = new Message(null,"Message two user 1", MessageType.HOME,u1);
		Message msg8 = new Message(null,"Message two user 2", MessageType.LIFE,u2);
		Message msg9 = new Message(null,"Message two user 3", MessageType.OTHER,u3);
		Message msg10 = new Message(null,"Message two user 4", MessageType.JOB,u4);
		Message msg11 = new Message(null,"Message two user 5", MessageType.SCHOOL, u5);
		Message msg12 = new Message(null,"Message two user 6", MessageType.JOB,u6);

		Message msg13 = new Message(null,"Message one user 7", MessageType.JOB,u7);
		Message msg14 = new Message(null,"Message one user 8", MessageType.JOB,u8);
		Message msg15 = new Message(null,"OTHER - Message one user 8", MessageType.LIFE,u9);

		messageRepository.saveAll(Arrays.asList(msg1, msg2, msg3, msg4, msg5, msg6, msg7, msg8,
												msg9, msg10, msg11, msg12, msg13, msg14, msg15));

	}
	
}
