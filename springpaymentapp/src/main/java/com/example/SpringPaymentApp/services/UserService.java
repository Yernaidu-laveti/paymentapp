package com.example.SpringPaymentApp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringPaymentApp.User;
import com.example.SpringPaymentApp.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepo;
	
	public boolean login(String userName,String password)
	{
		boolean found=false;
		found=userRepo.existsByUserNameAndPassword(userName,password);
		return found;
		
	}

	public User getProfile() 
	{
		User user=null;
		return user;
		//user=userRepo.getProfile();
		
	}

}
