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

import com.bjit.training.model.ProductAttributeItem;
import com.bjit.training.service.ProductAttributeItemService;


@Controller
@RequestMapping("/productattributeitems")
public class ProductAttributeItemController {
	
	@Autowired
	private ProductAttributeItemService productAttributeItemService;
	
	@GetMapping
    public String index() {
    	System.out.println("Index");
    	List<ProductAttributeItem> ls = productAttributeItemService.getAll();
        return "productattributeitems/index";
    }

    @GetMapping("{id}")
    public String show(@PathVariable int id) {
    	System.out.println("show");
    	ProductAttributeItem productAttributeItem = productAttributeItemService.getOne(id);
        return "productattributeitems/show";
    }
    
    
    @GetMapping("/create")
    public String create() {
    	System.out.println("create");
    	return "productattributeitems/create";
    }

    @PostMapping
    public String store(@RequestBody ProductAttributeItem productAttributeItem) {
    	System.out.println("store");
    	productAttributeItemService.save(productAttributeItem);
        return "redirect:productattributeitems/create";
    }
    
    @GetMapping("{id}/edit")
    public String edit() {
    	System.out.println("edit");
    	return "productattributeitems/edit";
    }

    @PostMapping("{id}")
    public String update(@PathVariable int id,@RequestBody ProductAttributeItem productAttributeItem) {
    	System.out.println("update");
    	productAttributeItemService.save(productAttributeItem);
    	return "redirect:create";
    }

   @DeleteMapping("{id}")
    public void delete(@PathVariable int id) {
    	System.out.println("delete");
    	productAttributeItemService.delete(id);
    }

}
