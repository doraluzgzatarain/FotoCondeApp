package com.fotocondeproducciones.portalweb.service;

import com.fotocondeproducciones.portalweb.model.User;
import com.fotocondeproducciones.portalweb.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Slf4j
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User createUser(User newUser) {
        Optional<User> optionalUser = userRepository.findByEmail(newUser.getEmail());
        if (optionalUser.isEmpty()) {
            return userRepository.save(newUser);
        } else {
            log.warn("User already exists");
        }
        return newUser;
    }

} //UserService
