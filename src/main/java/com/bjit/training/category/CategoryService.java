package com.bjit.training.category;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bjit.training.model.Categories;

@Service
public class CategoryService {
	
	@Autowired
	CategoryRepository categoryRepository;
	
	public List<Categories> getAll(){
		return categoryRepository.findAll();
	}
	
	public Categories getOne(int id) {
		Categories c = categoryRepository.findOne(id);
		return c;
	}

}
