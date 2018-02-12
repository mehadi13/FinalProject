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
import org.springframework.web.bind.annotation.ResponseBody;

import com.bjit.training.model.Product;
import com.bjit.training.service.ProductService;


@Controller
@RequestMapping("/products")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@GetMapping
    public String index() {
    	System.out.println("Index");
    	List<Product> ls = productService.getAll();
        return "products/index";
    }

    @GetMapping("{id}")
    public String show(@PathVariable int id) {
    	System.out.println("show");
    	Product product = productService.getOne(id);
        return "products/show";
    }
    
    
    @GetMapping("/create")
    public String create() {
    	System.out.println("create");
    	return "products/create";
    }

    @PostMapping
    public String store(@RequestBody Product product) {
    	System.out.println("store");
    	productService.save(product);
        return "redirect:products/create";
    }
    
    @GetMapping("{id}/edit")
    public String edit() {
    	System.out.println("edit");
    	return "products/edit";
    }

    @PostMapping("{id}")
    public String update(@PathVariable int id,@RequestBody Product product) {
    	System.out.println("update");
    	productService.save(product);
    	return "redirect:create";
    }

   @DeleteMapping("{id}")
    public void delete(@PathVariable int id) {
    	System.out.println("delete");
    	productService.delete(id);
    }

}
