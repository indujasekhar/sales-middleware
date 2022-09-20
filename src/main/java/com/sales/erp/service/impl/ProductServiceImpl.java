package com.sales.erp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sales.erp.dao.ProductDAO;
import com.sales.erp.entity.Product;
import com.sales.erp.service.ProductService;

@Component
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDAO productDAO;
	
	@Override
	public List<Product> getAllProducts() {
		return productDAO.getAllProducts();
	}

}
