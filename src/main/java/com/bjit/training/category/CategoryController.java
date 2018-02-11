package com.bjit.training.category;

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

import com.bjit.training.model.Categories;


@Controller
@RequestMapping("/categories")
public class CategoryController {
	
	@Autowired
	private CategoryService categoryService;
	
	@GetMapping
    public String index() {
    	System.out.println("Index");
    	List<Categories> ls = categoryService.getAll();
        return "categories/index";
    }

    @GetMapping("{id}")
    public String show(@PathVariable int id) {
    	System.out.println("show");
    	Categories category = categoryService.getOne(id);
    	System.out.println(category.getName());
        return "categories/show";
    }
    
    
    @GetMapping("/create")
    public String create() {
    	System.out.println("create");
    	return "categories/create";
    }

    @PostMapping
    public String store(@RequestBody Categories category) {
    	System.out.println("store");
        return "redirect:categories/create";
    }
    
    @GetMapping("{id}/edit")
    public String edit() {
    	System.out.println("edit");
    	return "categories/edit";
    }

    @PostMapping("{id}")
    public String update(@PathVariable long id,@RequestBody Categories category) {
    	System.out.println("update");
    	return "redirect:create";
    }

   @DeleteMapping("{id}")
    public @ResponseBody int delete(@PathVariable long id) {
    	System.out.println("delete");
        //return "redirect:/categories";
    	return 1;
    }

}
