package com.sample.sample.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sample.sample.model.Product;
import com.sample.sample.services.CrudService;

@RestController
public class CrudRestController {
	@Autowired
	private CrudService service;
	
	@GetMapping("/getproductlist")
	public List<Product> fetchProductList(){
		
		List<Product> products = new ArrayList<Product>();
		products= service.fetchProductList();
		return products;
		
	}
	@PostMapping("/addproduct")
	public Product saveProduct(@RequestBody Product product) {
		return service.saveProductToDB(product);
	}
}
