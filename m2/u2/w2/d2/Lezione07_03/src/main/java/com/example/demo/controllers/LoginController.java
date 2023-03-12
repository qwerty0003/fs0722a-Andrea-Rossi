package com.example.demo.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.models.User;

@Controller
public class LoginController {

	@GetMapping("/login")
	@ResponseStatus(HttpStatus.OK)
	public ModelAndView showFormLogin() {
		ModelAndView model = new ModelAndView("login");
		return model;
	}

	@PostMapping(value = "/home")
	@ResponseStatus(HttpStatus.OK)
	public @ResponseBody ModelAndView testLogin(User user) {
		ModelAndView model = new ModelAndView("home");
		model.addObject("name", user.getName());
		model.addObject("email", user.getEmail());
		return model;
	}
	
	@PostMapping(value = "/tost")
	@ResponseStatus(HttpStatus.NOT_IMPLEMENTED)
	public @ResponseBody String tost() {
		return "HOLA";
	}

}
