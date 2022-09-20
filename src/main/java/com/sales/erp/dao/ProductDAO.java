package com.sales.erp.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.sales.erp.entity.Product;

@Component
public interface ProductDAO {

	List<Product> getAllProducts();
}
