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
public class RegistrationController {

	@Autowired 
	private UserRepository userRepository;
	@GetMapping("/")
	public String home1() {
		return "login";
	}
	
	@GetMapping("/registration")
	public String home() {
		return "registration";
	}
	@PostMapping("/registration")
	public String Registrar(@ModelAttribute User user, Model model) {
		model.addAttribute("user",user);
		userRepository.save(user);
		return "login";
	}
}
