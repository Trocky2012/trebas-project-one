package com.starengtech.trebasProject.controllers;

import com.starengtech.trebasProject.entities.User;
import com.starengtech.trebasProject.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping
    public ResponseEntity<List<User>> findAll(){
        List<User> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id){
        User user = service.findById(id);
        return ResponseEntity.ok().body(user);
    }

    @GetMapping(value = "/find-by-name")
    public ResponseEntity <User> findUserByName(@RequestParam(name = "name") String name) {
        User user = service.findByName(name);
        if(user.getId()>0){
            return ResponseEntity.ok().body(user);
        }else{
            return ResponseEntity.noContent().build();
        }
    }

    @PostMapping
    public ResponseEntity<User> insert(@RequestBody User user){
        return ResponseEntity.ok().body(service.insert(user));
    }

}
