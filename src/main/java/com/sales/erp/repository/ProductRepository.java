package com.sales.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sales.erp.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{

}
