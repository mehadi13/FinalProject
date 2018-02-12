package com.bjit.training.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bjit.training.model.Product;
import com.bjit.training.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	ProductRepository productRepository;
	
	public List<Product> getAll(){
		return productRepository.findAll();
	}
	
	public Product getOne(int id) {
		return productRepository.findOne(id);
	}
	
	public void save(Product product){
		productRepository.save(product);
	}
	
	public void delete(int id){
		productRepository.delete(id);
	}

}
