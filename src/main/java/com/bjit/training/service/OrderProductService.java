package com.bjit.training.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bjit.training.model.OrderProduct;
import com.bjit.training.repository.OrderProductRepository;

@Service
public class OrderProductService {
	
	@Autowired
	OrderProductRepository orderProductRepository;
	
	public List<OrderProduct> getAll(){
		return orderProductRepository.findAll();
	}
	
	public OrderProduct getOne(int id) {
		return orderProductRepository.findOne(id);
	}
	
	public void save(OrderProduct orderProduct){
		orderProductRepository.save(orderProduct);
	}
	
	public void delete(int id){
		orderProductRepository.delete(id);
	}

}
