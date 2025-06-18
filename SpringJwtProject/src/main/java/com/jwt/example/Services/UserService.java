package com.jwt.example.Services;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.jwt.example.model.User;

@Service
public class UserService {
	
	private List<User> store= new ArrayList<>();

	public UserService() {
		store.add(new User(UUID.randomUUID().toString(),"Jitendra",
			"jitendrajittu1212@gmail.com"));
		store.add(new User(UUID.randomUUID().toString(),"Lavanya",
				"lavanya11@gmail.com"));
		store.add(new User(UUID.randomUUID().toString(),"Ramakrishna",
				"ramki@gmail.com"));
		store.add(new User(UUID.randomUUID().toString(),"Ravindra",
				"ravi@gmail.com"));
	}
	
	public List<User> getUsers(){
		return this.store;
	}
	
}
