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

import com.bjit.training.model.ProductImage;
import com.bjit.training.service.ProductImageService;


@Controller
@RequestMapping("/productimages")
public class ProductImageController {
	
	@Autowired
	private ProductImageService productImageService;
	
	@GetMapping
    public String index() {
    	System.out.println("Index");
    	List<ProductImage> ls = productImageService.getAll();
        return "productimages/index";
    }

    @GetMapping("{id}")
    public String show(@PathVariable int id) {
    	System.out.println("show");
    	ProductImage productImage = productImageService.getOne(id);
        return "productimages/show";
    }
    
    
    @GetMapping("/create")
    public String create() {
    	System.out.println("create");
    	return "productimages/create";
    }

    @PostMapping
    public String store(@RequestBody ProductImage productImage) {
    	System.out.println("store");
    	productImageService.save(productImage);
        return "redirect:productimages/create";
    }
    
    @GetMapping("{id}/edit")
    public String edit() {
    	System.out.println("edit");
    	return "productimages/edit";
    }

    @PostMapping("{id}")
    public String update(@PathVariable int id,@RequestBody ProductImage productImage) {
    	System.out.println("update");
    	productImageService.save(productImage);
    	return "redirect:create";
    }

   @DeleteMapping("{id}")
    public void delete(@PathVariable int id) {
    	System.out.println("delete");
    	productImageService.delete(id);
    }

}
