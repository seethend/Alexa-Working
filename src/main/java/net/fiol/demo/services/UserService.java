package net.fiol.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import net.fiol.demo.models.User;
import net.fiol.demo.repositories.UserRepository;



@Component
public class UserService {
	
	@Autowired
	UserRepository userRepository;

	public String getEmail(String username) {
		String email = "Not Found";
		if(userRepository.findByName(username).stream().findFirst().isPresent()) {
			email = userRepository.findByName(username).stream().findFirst().get().getEmail();
		}
		return email;
	}

	public User saveUser(User user) {
		return userRepository.save(user);
	}

	public List<User> getAllUsers() {
		return userRepository.findAll();
	}
	
}
