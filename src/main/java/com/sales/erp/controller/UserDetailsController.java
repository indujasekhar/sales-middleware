package com.sales.erp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sales.erp.entity.UserDetails;
import com.sales.erp.repository.UserDetailsRepository;

@RestController
@CrossOrigin("*")
public class UserDetailsController {
	
	@Autowired
	UserDetailsRepository userDetailsRepo;
	
	@PostMapping("/userDetails")
	public void createUserDetails(@RequestBody UserDetails userDetails) {
		userDetailsRepo.save(userDetails);
	}

	@GetMapping("/userDetails")
	public List<UserDetails> getAllUsers() {
		return userDetailsRepo.findAll();
	}
	
	@GetMapping("/userDetails/{id}")
	public List<UserDetails> getAllUsersByType(@PathVariable("id") int id) {
		return userDetailsRepo.getAllUsersByType(id);
	}
	
	@DeleteMapping("/userDetails/{id}")
	public void deleteUserDetails(@PathVariable("id") int id) {
		userDetailsRepo.deleteById(id);
	}
}
