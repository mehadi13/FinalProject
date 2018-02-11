package com.bjit.training.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bjit.training.model.Products;

@Service
public class ProductService {
	
	@Autowired
	ProductRepository productRepository;
	
	public List<Products> getAll(){
		return productRepository.findAll();
	}
	
	public Products getOne(int id) {
		Products c = productRepository.findOne(id);
		return c;
	}

}
