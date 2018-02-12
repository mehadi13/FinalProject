package com.bjit.training.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bjit.training.model.ProductImage;

public interface ProductImageRepository extends JpaRepository<ProductImage, Integer>  {

}
