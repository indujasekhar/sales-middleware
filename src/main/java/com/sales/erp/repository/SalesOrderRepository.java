package com.sales.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sales.erp.entity.SalesOrder;

public interface SalesOrderRepository extends JpaRepository<SalesOrder, Integer>{

}
