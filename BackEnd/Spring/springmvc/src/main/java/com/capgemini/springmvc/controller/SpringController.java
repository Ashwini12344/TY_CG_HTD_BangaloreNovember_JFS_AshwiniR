package com.capgemini.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.capgemini.springmvc.beans.User;

@Controller
public class SpringController {
	@RequestMapping("/hello")
	public String hello(ModelMap map) {
		map.addAttribute("msg","Hello world!!!!!!!!!!!!!");
		return "index";
	}
	//@RequestMapping(path="/query",method=RequestMethod.GET)//it is like overriding doGet in servlet
	@GetMapping("/query")//instead of request mapping
	public String query(@RequestParam("name")String name, @RequestParam("age")int age,ModelMap map) {
	map.addAttribute("name",name);
	map.addAttribute("age",age);
		return "query";
	}
	@GetMapping("/form")
	public String form() {
		return "form";
	}
	@PostMapping("/form")
	public String form(User user,ModelMap map) {
		map.addAttribute("name",user.getName());
		map.addAttribute("email",user.getEmail());
		map.addAttribute("password",user.getPassword());
		map.addAttribute("gender",user.getGender());
		return "form";
	}

}
