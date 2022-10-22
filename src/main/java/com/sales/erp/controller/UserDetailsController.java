package com.sales.erp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sales.erp.entity.UserDetails;
import com.sales.erp.repository.UserDetailsRepository;

@RestController
@CrossOrigin("*")
public class UserDetailsController {
	
	@Autowired
	UserDetailsRepository userDetailsRepo;

	@GetMapping("/userDetails")
	public List<UserDetails> getAllUsers() {
		return userDetailsRepo.findAll();
	}
	
	@GetMapping("/userDetails/{id}")
	public List<UserDetails> getAllUsersByType(@PathVariable("id") int id) {
		return userDetailsRepo.getAllUsersByType(id);
	}
}
