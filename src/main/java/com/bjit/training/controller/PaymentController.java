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

import com.bjit.training.model.Payment;
import com.bjit.training.service.PaymentService;


@Controller
@RequestMapping("/payments")
public class PaymentController {
	
	@Autowired
	private PaymentService paymentService;
	
	@GetMapping
    public String index() {
    	System.out.println("Index");
    	List<Payment> ls = paymentService.getAll();
        return "payments/index";
    }

    @GetMapping("{id}")
    public String show(@PathVariable int id) {
    	System.out.println("show");
    	Payment payment = paymentService.getOne(id);
        return "payments/show";
    }
    
    
    @GetMapping("/create")
    public String create() {
    	System.out.println("create");
    	return "payments/create";
    }

    @PostMapping
    public String store(@RequestBody Payment payment) {
    	System.out.println("store");
    	paymentService.save(payment);
        return "redirect:payments/create";
    }
    
    @GetMapping("{id}/edit")
    public String edit() {
    	System.out.println("edit");
    	return "payments/edit";
    }

    @PostMapping("{id}")
    public String update(@PathVariable int id,@RequestBody Payment payment) {
    	System.out.println("update");
    	paymentService.save(payment);
    	return "redirect:create";
    }

   @DeleteMapping("{id}")
    public void delete(@PathVariable int id) {
    	System.out.println("delete");
    	paymentService.delete(id);
    }

}
