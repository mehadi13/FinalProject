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

import com.bjit.training.model.Rating;
import com.bjit.training.service.RatingService;


@Controller
@RequestMapping("/ratings")
public class RatingController {
	
	@Autowired
	private RatingService ratingService;
	
	@GetMapping
    public String index() {
    	System.out.println("Index");
    	List<Rating> ls = ratingService.getAll();
        return "ratings/index";
    }

    @GetMapping("{id}")
    public String show(@PathVariable int id) {
    	System.out.println("show");
    	Rating rating = ratingService.getOne(id);
        return "ratings/show";
    }
    
    
    @GetMapping("/create")
    public String create() {
    	System.out.println("create");
    	return "ratings/create";
    }

    @PostMapping
    public String store(@RequestBody Rating rating) {
    	System.out.println("store");
    	ratingService.save(rating);
        return "redirect:ratings/create";
    }
    
    @GetMapping("{id}/edit")
    public String edit() {
    	System.out.println("edit");
    	return "ratings/edit";
    }

    @PostMapping("{id}")
    public String update(@PathVariable int id,@RequestBody Rating rating) {
    	System.out.println("update");
    	ratingService.save(rating);
    	return "redirect:create";
    }

   @DeleteMapping("{id}")
    public void delete(@PathVariable int id) {
    	System.out.println("delete");
    	ratingService.delete(id);
    }

}
