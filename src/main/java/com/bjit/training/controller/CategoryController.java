package com.bjit.training.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import com.bjit.training.model.Category;
import com.bjit.training.service.CategoryService;


@Controller
@RequestMapping("/categories")
public class CategoryController {
	
	@Autowired
	private CategoryService categoryService;
	
	@GetMapping
    public String index() {
    	System.out.println("Index");
    	return "categories/index";
    }

    @GetMapping("{id}")
    public String show(@PathVariable int id) {
    	System.out.println("show");
    	Category category = categoryService.getOne(id);
        return "categories/show";
    }
    
    
    @GetMapping("/create")
    public String create() {
    	System.out.println("create");
    	return "categories/create";
    }

    @PostMapping
    public String store(@RequestBody Category category) {
    	System.out.println("store");
    	categoryService.save(category);
        return "redirect:categories/create";
    }
    
    @GetMapping("{id}/edit")
    public String edit() {
    	System.out.println("edit");
    	return "categories/edit";
    }

    @PostMapping("{id}")
    public String update(@PathVariable int id,@RequestBody Category category) {
    	System.out.println("update");
    	categoryService.save(category);
    	return "redirect:create";
    }

   @DeleteMapping("{id}")
    public void delete(@PathVariable int id) {
    	System.out.println("delete");
    	categoryService.delete(id);
    }

}
