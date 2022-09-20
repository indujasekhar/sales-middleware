package com.sales.erp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sales.erp.entity.Particular;
import com.sales.erp.repository.ParticularRepository;

@RestController
@CrossOrigin("*")
public class ParticularController {

	@Autowired
	ParticularRepository particularRepo;
	
	@PostMapping("/particulars")
	public void createParticulars(@RequestBody Particular particular) {
		particularRepo.save(particular);
	}
	
	@GetMapping("/particulars")
	public List<Particular> getAllParticulars() {
		return particularRepo.findAll();
	}
}
