package com.sales.erp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sales.erp.entity.PurchaseOrder;
import com.sales.erp.repository.PurchaseOrderRepository;

@RestController
@CrossOrigin("*")
public class PurchaseOrderController {

	@Autowired
	PurchaseOrderRepository purchaseOrderRepo;
	
	@PostMapping("/purchaseOrder")
	public void createPurchaseOrder(@RequestBody PurchaseOrder purchaseOrder) {
		purchaseOrderRepo.save(purchaseOrder);
	}
}
