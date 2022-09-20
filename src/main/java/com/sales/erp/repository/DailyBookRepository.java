package com.sales.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sales.erp.entity.DailyBook;
	
@Repository
public interface DailyBookRepository extends JpaRepository<DailyBook, Integer> {

}
