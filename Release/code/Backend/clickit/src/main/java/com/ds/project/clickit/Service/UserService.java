package com.ds.project.clickit.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ds.project.clickit.Entity.User;
import com.ds.project.clickit.Repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;
	
	public User getUserById(int id) {
		User user = null;
		Optional<User> OptUser = userRepository.findById(id);
		
		if (OptUser.isPresent()) {
			user=OptUser.get();
			return user;
		}else {
			return user;
		}
		
	}
}
