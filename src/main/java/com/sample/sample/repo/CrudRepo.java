package com.sample.sample.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sample.sample.model.Product;

public interface CrudRepo extends JpaRepository<Product, Integer> {

}
