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

import com.bjit.training.model.Order;
import com.bjit.training.service.OrderService;


@Controller
@RequestMapping("/orders")
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	
	@GetMapping
    public String index() {
    	System.out.println("Index");
    	List<Order> ls = orderService.getAll();
        return "orders/index";
    }

    @GetMapping("{id}")
    public String show(@PathVariable int id) {
    	System.out.println("show");
    	Order order = orderService.getOne(id);
        return "orders/show";
    }
    
    
    @GetMapping("/create")
    public String create() {
    	System.out.println("create");
    	return "orders/create";
    }

    @PostMapping
    public String store(@RequestBody Order order) {
    	System.out.println("store");
    	orderService.save(order);
        return "redirect:orders/create";
    }
    
    @GetMapping("{id}/edit")
    public String edit() {
    	System.out.println("edit");
    	return "orders/edit";
    }

    @PostMapping("{id}")
    public String update(@PathVariable int id,@RequestBody Order order) {
    	System.out.println("update");
    	orderService.save(order);
    	return "redirect:create";
    }

   @DeleteMapping("{id}")
    public void delete(@PathVariable int id) {
    	System.out.println("delete");
    	orderService.delete(id);
    }

}
