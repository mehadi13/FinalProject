package com.bjit.training.product;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bjit.training.model.Products;

public interface ProductRepository extends JpaRepository<Products, Integer>  {

}
