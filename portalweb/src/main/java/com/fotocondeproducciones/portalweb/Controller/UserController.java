package com.fotocondeproducciones.portalweb.Controller;

import com.fotocondeproducciones.portalweb.model.User;
import com.fotocondeproducciones.portalweb.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/contrato/nuevo/usuario")
    public User createUser(@RequestBody User newUser) {
        return userService.createUser(newUser);
    }

}
