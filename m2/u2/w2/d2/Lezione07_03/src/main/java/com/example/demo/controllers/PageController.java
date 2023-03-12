package com.example.demo.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;



@Controller
@RequestMapping("/api")
public class PageController {

	@GetMapping("/homepage")
	public @ResponseBody String getHomePage() {
		return "Prima pagina Spring Web MVC";
	}

	@GetMapping("/about")
	public @ResponseBody String getAboutPage() {
		return "Ciao a tutti! Sono Spring Web MVC :D";
	}

	@GetMapping("/contact")
	public @ResponseBody String getContactPage() {
		return "Messaggio inviato!";
	}

	@GetMapping("/test")
	public @ResponseBody String getTestPage(@RequestParam String name, @RequestParam String lastname,
			@RequestParam(name = "age", required = false) String age) {
		if (age != null)
			return "Test parameter: " + name + " " + lastname + ", age: " + age;
		else
			return "Test parameter: " + name + " " + lastname;
	}

	@GetMapping("/test2/{name}/{lastname}")
	public @ResponseBody String getTest2Page(@PathVariable String name, @PathVariable String lastname) {

		return "Test parameter number TWO: " + name + " " + lastname;
	}
	
	//PAGINA HTML SENZA VARIABILI
	//@GetMapping("/test3")
	//public String getThymeleaf() {
	//	return "test";
	//}
	
	@GetMapping("/test3/{name}/{lastname}")
	public String getThymeleafPage(Map<String,Object> model,
			@PathVariable String name,
			@PathVariable String lastname) {
		model.put("testName", name);
		model.put("testLName", lastname);
		return "test";
	}
	
	@GetMapping("/test4/{name}/{lastname}")
	public String getThymeleafPage2(Model model,
			@PathVariable String name,
			@PathVariable String lastname) {
		model.addAttribute("testName",name);
		model.addAttribute("testLName", lastname);
		return "test";
	}
	
	@GetMapping("/test5/{name}/{lastname}")
	public ModelAndView getThymeleafPage3(
			@PathVariable String name,
			@PathVariable String lastname) {
		ModelAndView model = new ModelAndView("test");
		model.addObject("testName",name);
		model.addObject("testLName",lastname);
		return model;
	}

}
