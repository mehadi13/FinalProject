package com.bjit.training.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bjit.training.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>  {

}
