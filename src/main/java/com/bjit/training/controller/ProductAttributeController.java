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

import com.bjit.training.model.ProductAttribute;
import com.bjit.training.service.ProductAttributeService;


@Controller
@RequestMapping("/productattributes")
public class ProductAttributeController {
	
	@Autowired
	private ProductAttributeService productAttributeService;
	
	@GetMapping
    public String index() {
    	System.out.println("Index");
    	List<ProductAttribute> ls = productAttributeService.getAll();
        return "productattributes/index";
    }

    @GetMapping("{id}")
    public String show(@PathVariable int id) {
    	System.out.println("show");
    	ProductAttribute productAttribute = productAttributeService.getOne(id);
        return "productattributes/show";
    }
    
    
    @GetMapping("/create")
    public String create() {
    	System.out.println("create");
    	return "productattributes/create";
    }

    @PostMapping
    public String store(@RequestBody ProductAttribute productAttribute) {
    	System.out.println("store");
    	productAttributeService.save(productAttribute);
        return "redirect:productattributes/create";
    }
    
    @GetMapping("{id}/edit")
    public String edit() {
    	System.out.println("edit");
    	return "productattributes/edit";
    }

    @PostMapping("{id}")
    public String update(@PathVariable int id,@RequestBody ProductAttribute productAttribute) {
    	System.out.println("update");
    	productAttributeService.save(productAttribute);
    	return "redirect:create";
    }

   @DeleteMapping("{id}")
    public void delete(@PathVariable int id) {
    	System.out.println("delete");
    	productAttributeService.delete(id);
    }

}
