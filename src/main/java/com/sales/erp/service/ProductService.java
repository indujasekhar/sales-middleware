package com.sales.erp.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.sales.erp.entity.Product;

@Component
public interface ProductService {

	List<Product> getAllProducts();
}
