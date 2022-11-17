package com.sales.erp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sales.erp.entity.Product;
import com.sales.erp.repository.ProductRepository;
import com.sales.erp.service.ProductService;

@RestController	
//Adding the @CrossOrigin("*") annotation will allow the requests from all sources to access the rest api
@CrossOrigin("*")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@Autowired
	private ProductRepository productRepo;

	@RequestMapping("/products")
	public List<Product> getAllProducts() {
		return productService.getAllProducts();
	}
	
	@PostMapping("/products")
	public void createProducts(@RequestBody Product product) {
		productRepo.save(product);
	}
	
	@GetMapping("/products/{id}") 
	public Product getProductById(@PathVariable("id") int id) {
		return productRepo.findById(id).get();
	}
	
	@DeleteMapping("/products/{id}")
	public void deleteProducts(@PathVariable("id") int id) {
		productRepo.deleteById(id);
	}
	
}
