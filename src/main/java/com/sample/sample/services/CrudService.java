package com.sample.sample.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.sample.model.Product;
import com.sample.sample.repo.CrudRepo;

@Service
public class CrudService {
	@Autowired
	private CrudRepo repo;	
	
	public List<Product> fetchProductList()
	{
		return repo.findAll();
	}	
	
	public Product saveProductToDB(Product product)
	{
		return repo.save(product);
	}
}


