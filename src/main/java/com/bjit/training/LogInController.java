package com.bjit.training;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LogInController {
	
	@GetMapping("/login")
	public String login(){
		return "login";
	}
	
	@GetMapping("/index")
	public String index(){
		return "index";
	}
	
	/*@PostMapping("/login")
	public String loginPost(){
		System.out.println("login process");
		return "login";
	}*/
	
}
