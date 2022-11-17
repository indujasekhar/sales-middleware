package com.sales.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sales.erp.entity.PurchaseOrder;

public interface PurchaseOrderRepository extends JpaRepository<PurchaseOrder, Integer>{

}
