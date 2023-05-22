package com.Service;

import java.util.List;

import com.Model.User;

public interface UserService {
	
		User saveUser( User user);
		User displayUser(int id);
		void updateUser(int  id);
		
		List<User> getUsers();
		
}
