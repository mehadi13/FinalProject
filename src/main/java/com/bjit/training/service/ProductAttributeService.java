package com.bjit.training.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bjit.training.model.ProductAttribute;
import com.bjit.training.repository.ProductAttributeRepository;

@Service
public class ProductAttributeService {
	
	@Autowired
	ProductAttributeRepository productAttributeRepository;
	
	public List<ProductAttribute> getAll(){
		return productAttributeRepository.findAll();
	}
	
	public ProductAttribute getOne(int id) {
		return productAttributeRepository.findOne(id);
	}
	
	public void save(ProductAttribute productAttribute){
		productAttributeRepository.save(productAttribute);
	}
	
	public void delete(int id){
		productAttributeRepository.delete(id);
	}

}
