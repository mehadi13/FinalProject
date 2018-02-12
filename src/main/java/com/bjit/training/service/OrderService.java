package com.bjit.training.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bjit.training.model.Order;
import com.bjit.training.repository.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	OrderRepository orderRepository;
	
	public List<Order> getAll(){
		return orderRepository.findAll();
	}
	
	public Order getOne(int id) {
		return orderRepository.findOne(id);
	}
	
	public void save(Order order){
		orderRepository.save(order);
	}
	
	public void delete(int id){
		orderRepository.delete(id);
	}

}
