package com.example.user.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.user.entity.User;
import com.example.user.repo.UserRepo;

@RestController
public class UserController {
	
	@Autowired
	UserRepo userRepo;
	
	@PostMapping("/save")
	public User saveUser(@RequestBody User user)
	{
		return userRepo.save(user);
	}
	
	@GetMapping("/fetch/{Id}")
	public Optional<User> findById(@PathVariable Integer Id)
	{
		return userRepo.findById(Id);
	}
	
	@GetMapping("/fetch")
	public List<User> findAll()
	{
		return userRepo.findAll();
	}
}
