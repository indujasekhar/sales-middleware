package com.sales.erp.controller;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sales.erp.entity.DailyBook;
import com.sales.erp.exception.ResourceNotFoundException;
import com.sales.erp.repository.DailyBookRepository;
import com.sales.erp.service.DailyBookService;

/**
 * @author Induja
 */
@RestController
@CrossOrigin("*")
public class DailyBookController {

	@Autowired
	DailyBookService dailyBookService;
	
	@Autowired
	DailyBookRepository dailyBookRepo;
	
	@RequestMapping(value = "/dailyBook", method = RequestMethod.POST)
	public void createDailyBook(@RequestBody DailyBook dailyBook) {
		dailyBook.setDailyBookDate(Date.valueOf(LocalDate.now()));
		dailyBook.setModifiedDate(Date.valueOf(LocalDate.now()));
		dailyBookService.createUser(dailyBook);
	}
	
	@RequestMapping(value = "/dailyBooks", method = RequestMethod.GET)
	public List<DailyBook> getAllDailyBooks() {
		return dailyBookService.getAllDailyBooks();
	}
	
	@RequestMapping(value = "/dailyBook/{id}", method = RequestMethod.GET)
	public ResponseEntity<DailyBook> getAllDailyBooks(@PathVariable("id") int id) 
			throws ResourceNotFoundException {
		DailyBook dailyBook = dailyBookRepo.findById(id)
		          .orElseThrow(() -> new ResourceNotFoundException("Details not found for this id :: " + id));
		return ResponseEntity.ok().body(dailyBook);
	}
	
	@RequestMapping(value = "/dailyBook/{id}", method = RequestMethod.DELETE)
	public void deleteDailyBook(@PathVariable("id") int id) {
		dailyBookRepo.deleteById(id);
	}
}
