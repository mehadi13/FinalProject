package com.bjit.training.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bjit.training.model.Order;

public interface OrderRepository extends JpaRepository<Order, Integer>  {

}
