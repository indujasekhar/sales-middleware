package com.sales.erp.controller;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sales.erp.entity.UserType;
import com.sales.erp.repository.UserTypeRepository;

@RestController
@CrossOrigin("*")
public class UserTypeController {

	@Autowired
	UserTypeRepository userTypeRepo;
	
	@PostMapping("/userType")
	public void createUserType(@RequestBody UserType userType) {
		userType.setModifiedDate(Date.valueOf(LocalDate.now()));
		if(null != userType.getTypeName() && userType.getTypeName().length() > 0) {
			userTypeRepo.save(userType);
		}
	}
	
	@GetMapping("/userType")
	public List<UserType> getAllUserTypes() {
		return userTypeRepo.findAll();
	}
	
	@GetMapping("/userType/{id}")
	public UserType getUserTypeById(@PathVariable("id") int id) {
		return userTypeRepo.findById(id).get();
	}
	
	@DeleteMapping("/userType/{id}")
	public void deleteUserType(@PathVariable("id") int id) {
		userTypeRepo.deleteById(id);
	}
}
