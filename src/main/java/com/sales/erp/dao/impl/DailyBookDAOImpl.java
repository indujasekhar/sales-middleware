package com.sales.erp.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sales.erp.dao.DailyBookDAO;
import com.sales.erp.entity.DailyBook;
import com.sales.erp.repository.DailyBookRepository;

@Component
public class DailyBookDAOImpl implements DailyBookDAO {
	
	@Autowired
	DailyBookRepository dailyBookRepo;
	
	@Override
	public void createUser(DailyBook dailyBook) {
		dailyBookRepo.save(dailyBook);
	}

	@Override
	public List<DailyBook> getAllDailyBooks() {
		return (List<DailyBook>) dailyBookRepo.findAll();
	}

	@Override
	public DailyBook getAllDailyBookById(int id) {
		//if(dailyBookRepo.findById(Integer.valueOf(id)).isPresent()) {
		return dailyBookRepo.findById(Integer.valueOf(id)).get();
		//}
	}

}
