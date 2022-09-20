package com.sales.erp.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sales.erp.dao.ProductDAO;
import com.sales.erp.entity.Product;
import com.sales.erp.repository.ProductRepository;

@Component
public class ProductDAOImpl implements ProductDAO {

	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public List<Product> getAllProducts() {
		return (List<Product>) productRepository.findAll();
	}

}
