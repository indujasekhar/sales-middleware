package com.sales.erp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sales.erp.entity.UserType;
import com.sales.erp.repository.UserTypeRepository;

@RestController
public class UserTypeController {

	@Autowired
	UserTypeRepository userTypeRepo;
	
	@PostMapping("/userType")
	public void createUserType(@RequestBody UserType userType) {
		userTypeRepo.save(userType);
	}
	
	@GetMapping("/userType")
	public List<UserType> getAllUserTypes() {
		return userTypeRepo.findAll();
	}
}