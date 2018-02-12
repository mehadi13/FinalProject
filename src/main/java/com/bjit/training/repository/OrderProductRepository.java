package com.bjit.training.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bjit.training.model.OrderProduct;

public interface OrderProductRepository extends JpaRepository<OrderProduct, Integer>  {

}
