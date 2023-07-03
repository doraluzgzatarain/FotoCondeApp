package com.fotocondeproducciones.portalwebapp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fotocondeproducciones.portalwebapp.model.User;
import com.fotocondeproducciones.portalwebapp.service.UserService;

@RestController
@RequestMapping(path= "/nuevo/contrato")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping
	public boolean createUser(@RequestBody User user) {
		return userService.createUser(user);
	}

}
