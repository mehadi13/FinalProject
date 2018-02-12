package com.bjit.training.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bjit.training.model.ProductAttributeItem;
import com.bjit.training.repository.ProductAttributeItemRepository;

@Service
public class ProductAttributeItemService {
	
	@Autowired
	ProductAttributeItemRepository productAttributeItemRepository;
	
	public List<ProductAttributeItem> getAll(){
		return productAttributeItemRepository.findAll();
	}
	
	public ProductAttributeItem getOne(int id) {
		return productAttributeItemRepository.findOne(id);
	}
	
	public void save(ProductAttributeItem productAttributeItem){
		productAttributeItemRepository.save(productAttributeItem);
	}
	
	public void delete(int id){
		productAttributeItemRepository.delete(id);
	}

}
