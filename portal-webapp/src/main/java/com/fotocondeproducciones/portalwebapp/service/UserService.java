package com.fotocondeproducciones.portalwebapp.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.fotocondeproducciones.portalwebapp.model.User;
import com.fotocondeproducciones.portalwebapp.repository.UserRepository;


public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public boolean createUser(User user) {
		boolean userAlreadyRegistered;
		Optional<User> optionalUser = userRepository.findByEmail(user.getEmail());
		if(optionalUser.isEmpty()) {
			userRepository.save(user);
			userAlreadyRegistered = false;
			return userAlreadyRegistered;
		}else{
			userAlreadyRegistered = true;
			return userAlreadyRegistered;
		}
	}

} //UserService
