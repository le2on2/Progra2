package com.programacion2.intranetgrupo2.repository;

import org.springframework.data.repository.CrudRepository;

import com.programacion2.intranetgrupo2.model.User;

public interface UserRepository extends CrudRepository<User, Long> {

	public User findByemail(String email);
	
	User findByemailAndPassword(String email, String password);
	
}
