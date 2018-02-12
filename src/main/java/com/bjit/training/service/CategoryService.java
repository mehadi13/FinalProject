package com.bjit.training.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bjit.training.model.Category;
import com.bjit.training.repository.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	CategoryRepository categoryRepository;
	
	public List<Category> getAll(){
		return categoryRepository.findAll();
	}
	
	public Category getOne(int id) {
		return categoryRepository.findOne(id);
	}
	
	public void save(Category category){
		categoryRepository.save(category);
	}
	
	public void delete(int id){
		categoryRepository.delete(id);
	}

}
