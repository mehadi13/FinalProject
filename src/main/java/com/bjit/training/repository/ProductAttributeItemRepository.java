package com.bjit.training.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bjit.training.model.ProductAttributeItem;

public interface ProductAttributeItemRepository extends JpaRepository<ProductAttributeItem, Integer>  {

}
