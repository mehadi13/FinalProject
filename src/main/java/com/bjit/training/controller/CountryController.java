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

import com.bjit.training.model.Country;
import com.bjit.training.service.CountryService;


@Controller
@RequestMapping("/countries")
public class CountryController {
	
	@Autowired
	private CountryService countryService;
	
	@GetMapping
    public String index() {
    	System.out.println("Index");
    	List<Country> ls = countryService.getAll();
        return "countries/index";
    }

    @GetMapping("{id}")
    public String show(@PathVariable int id) {
    	System.out.println("show......");
    	Country country = countryService.getOne(id);
        return "countries/show";
    }
    
    
    @GetMapping("/create")
    public String create() {
    	System.out.println("create");
    	return "countries/create";
    }

    @PostMapping
    public String store(@RequestBody Country country) {
    	System.out.println("store");
    	countryService.save(country);
        return "redirect:countries/create";
    }
    
    @GetMapping("{id}/edit")
    public String edit() {
    	System.out.println("edit");
    	return "countries/edit";
    }

    @PostMapping("{id}")
    public String update(@PathVariable int id,@RequestBody Country country) {
    	System.out.println("update");
    	countryService.save(country);
    	return "redirect:create";
    }

   @DeleteMapping("{id}")
    public void delete(@PathVariable int id) {
    	System.out.println("delete");
    	countryService.delete(id);
    }

}
