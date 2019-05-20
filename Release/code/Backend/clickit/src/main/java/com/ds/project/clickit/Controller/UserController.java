package com.ds.project.clickit.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ds.project.clickit.Entity.Train;
import com.ds.project.clickit.Entity.User;
import com.ds.project.clickit.Repository.UserRepository;

@RestController
@RequestMapping(path = "/user")
public class UserController {

	@Autowired
	UserRepository userrepo;
	
	@GetMapping("/hello")
    public String index() {
		System.out.println("Greetings from Spring Boot!");
        return "Greetings from Spring Boot!";
    }
	
	@GetMapping("/allUser")
	 public List<User> findAll(){
		
		List<User> users;
		
		users = userrepo.findAll();
			if(users!=null) {
				for(User train : users) {
					System.out.println(train.toString());
					System.out.println("Succes");
				}
			}else {
				System.out.println("Fail");
			}
		
		
		
	   return users;
	 }
	
}
