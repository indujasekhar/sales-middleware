package com.sales.erp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sales.erp.entity.SalesOrder;
import com.sales.erp.repository.SalesOrderRepository;

@RestController
@CrossOrigin("*")
public class SalesOrderController {
	
	@Autowired
	SalesOrderRepository salesOrderRepo;

	@PostMapping("/salesOrder")
	public void createSalesOrder(@RequestBody SalesOrder salesOrder) {
		salesOrderRepo.save(salesOrder);
	}
	
}
