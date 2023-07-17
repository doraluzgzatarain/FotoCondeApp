package com.fotocondeproducciones.portalweb.repository;


import java.util.Optional;

import com.fotocondeproducciones.portalweb.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

	Optional<User> findByEmail(String email);


} //interface UserRepository
