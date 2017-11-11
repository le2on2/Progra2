package com.programacion2.intranetgrupo2.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.programacion2.intranetgrupo2.model.User;
import com.programacion2.intranetgrupo2.repository.UserRepository;


@Controller
public class LoginController {

@Autowired
private UserRepository userRepository;

@GetMapping("/")
public String home1() {
	return "login";
}

@PostMapping("/login")
public String Login(String email, String password) {

	User user = userRepository.findByemailAndPassword(email, password);
	
	if(user == null) {
		return "login";
	}
	return "result";
}
}