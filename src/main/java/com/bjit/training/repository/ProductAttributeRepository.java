package com.bjit.training.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bjit.training.model.ProductAttribute;

public interface ProductAttributeRepository extends JpaRepository<ProductAttribute, Integer>  {

}
