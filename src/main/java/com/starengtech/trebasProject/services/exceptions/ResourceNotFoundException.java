package com.starengtech.trebasProject.services.exceptions;

import com.starengtech.trebasProject.entities.User;

import java.util.Optional;

public class ResourceNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public ResourceNotFoundException (Long id) {
		super("Resource not found. ID "+id);
	}
	public ResourceNotFoundException (String name) {
		super("User name not found. NAME "+name);
	}

}
