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

import com.bjit.training.model.OrderProduct;
import com.bjit.training.service.OrderProductService;


@Controller
@RequestMapping("/orderproducts")
public class OrderProductController {
	
	@Autowired
	private OrderProductService orderProductService;
	
	@GetMapping
    public String index() {
    	System.out.println("Index");
    	List<OrderProduct> ls = orderProductService.getAll();
        return "orderproducts/index";
    }

    @GetMapping("{id}")
    public String show(@PathVariable int id) {
    	System.out.println("show");
    	OrderProduct orderProduct = orderProductService.getOne(id);
        return "orderproducts/show";
    }
    
    
    @GetMapping("/create")
    public String create() {
    	System.out.println("create");
    	return "orderproducts/create";
    }

    @PostMapping
    public String store(@RequestBody OrderProduct orderProduct) {
    	System.out.println("store");
    	orderProductService.save(orderProduct);
        return "redirect:orderproducts/create";
    }
    
    @GetMapping("{id}/edit")
    public String edit() {
    	System.out.println("edit");
    	return "orderproducts/edit";
    }

    @PostMapping("{id}")
    public String update(@PathVariable int id,@RequestBody OrderProduct orderProduct) {
    	System.out.println("update");
    	orderProductService.save(orderProduct);
    	return "redirect:create";
    }

   @DeleteMapping("{id}")
    public void delete(@PathVariable int id) {
    	System.out.println("delete");
    	orderProductService.delete(id);
    }

}
