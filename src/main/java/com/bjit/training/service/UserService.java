package com.bjit.training.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bjit.training.model.User;
import com.bjit.training.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;
	
	public List<User> getAll(){
		return userRepository.findAll();
	}
	
	public User getOne(int id) {
		return userRepository.findOne(id);
	}
	
	public void save(User user){
		userRepository.save(user);
	}
	
	public void delete(int id){
		userRepository.delete(id);
	}

}
