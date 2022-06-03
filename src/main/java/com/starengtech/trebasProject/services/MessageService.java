package com.starengtech.trebasProject.services;

import com.starengtech.trebasProject.entities.Message;
import com.starengtech.trebasProject.repositories.MessageRepository;
import com.starengtech.trebasProject.services.exceptions.DatabaseException;
import com.starengtech.trebasProject.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;

@Service
public class MessageService {

    @Autowired
    private MessageRepository repository;

    public List<Message> findAll() {
        //return repository.findAllByOrderByIdDesc();
        return repository.findAll();
    }

    public Message findById(Long id) {
        Optional<Message> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ResourceNotFoundException(id) );
    }

    public Message insert(Message message) {
        message.setText(message.getText());
        return repository.save(message);
    }

    public void delete(Long id) {
        try {
            repository.deleteById(id);
        }catch(EmptyResultDataAccessException e) {
            throw new ResourceNotFoundException(id);
        }catch(DataIntegrityViolationException e) {
            throw new DatabaseException(e.getMessage());
        }
    }

    public Message update(Long id, Message Message) {
        try {
            Message entity = repository.getById(id);
            entity.setText(Message.getText());
            return repository.save(entity);
        }catch(EntityNotFoundException e) {
            throw new ResourceNotFoundException(id);
        }
    }



  

}
