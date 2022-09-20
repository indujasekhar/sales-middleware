package com.sales.erp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sales.erp.dao.DailyBookDAO;
import com.sales.erp.entity.DailyBook;
import com.sales.erp.service.DailyBookService;

@Component
public class DailyBookServiceImpl implements DailyBookService {
	
	@Autowired
	DailyBookDAO dailyBookDAO;
	
	@Override
	public void createUser(DailyBook dailyBook) {
		dailyBookDAO.createUser(dailyBook);
	}

	@Override
	public List<DailyBook> getAllDailyBooks() {
		return dailyBookDAO.getAllDailyBooks();
	}

	@Override
	public DailyBook getAllDailyBookById(int id) {
		return dailyBookDAO.getAllDailyBookById(id);
	}

}
