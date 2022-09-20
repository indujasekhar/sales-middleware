package com.sales.erp.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.sales.erp.entity.DailyBook;

@Component
public interface DailyBookDAO {

	void createUser(DailyBook dailyBook);
	
	List<DailyBook> getAllDailyBooks();
	
	DailyBook getAllDailyBookById(int id);
}
