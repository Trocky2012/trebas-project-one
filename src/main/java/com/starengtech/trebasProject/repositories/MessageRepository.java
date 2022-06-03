package com.starengtech.trebasProject.repositories;

import com.starengtech.trebasProject.entities.Message;
import com.starengtech.trebasProject.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MessageRepository extends JpaRepository<Message, Long> {

    List<Message> findAllByOrderByIdDesc();

}
