package com.sales.erp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sales.erp.entity.Product;
import com.sales.erp.service.ProductService;

@RestController	
//Adding the @CrossOrigin("*") annotation will allow the requests from all sources to access the rest api
@CrossOrigin("*")
public class ProductController {
	
	@Autowired
	private ProductService productService;

	@RequestMapping("/products")
	public List<Product> getAllProducts() {
		return productService.getAllProducts();
	}
}
