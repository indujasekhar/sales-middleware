package com.sales.erp.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.sales.erp.entity.DailyBook;

@Component
public interface DailyBookService {
	
	void createUser(DailyBook dailyBook);
	
	List<DailyBook> getAllDailyBooks();
	
	DailyBook getAllDailyBookById(int id);
}
