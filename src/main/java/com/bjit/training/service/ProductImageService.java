package com.bjit.training.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bjit.training.model.ProductImage;
import com.bjit.training.repository.ProductImageRepository;

@Service
public class ProductImageService {
	
	@Autowired
	ProductImageRepository productImageRepository;
	
	public List<ProductImage> getAll(){
		return productImageRepository.findAll();
	}
	
	public ProductImage getOne(int id) {
		return productImageRepository.findOne(id);
	}
	
	public void save(ProductImage productImage){
		productImageRepository.save(productImage);
	}
	
	public void delete(int id){
		productImageRepository.delete(id);
	}

}
