package com.starengtech.trebasProject.controllers;

import com.starengtech.trebasProject.entities.Message;
import com.starengtech.trebasProject.entities.User;
import com.starengtech.trebasProject.services.MessageService;
import com.starengtech.trebasProject.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/messages")
public class MessageController {

    @Autowired
    private MessageService service;

    @GetMapping
    public ResponseEntity<List<Message>> findAll(){
        List<Message> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Message> findById(@PathVariable Long id){
        Message user = service.findById(id);
        return ResponseEntity.ok().body(user);
    }

    @PostMapping
    public ResponseEntity<Message> insert(@RequestBody Message message){
        return ResponseEntity.ok().body(service.insert(message));
    }

}
