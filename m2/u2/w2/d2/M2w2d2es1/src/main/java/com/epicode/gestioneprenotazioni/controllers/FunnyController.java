package com.epicode.gestioneprenotazioni.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class FunnyController {
	
	
	
	@GetMapping("/form")
	public ModelAndView formLingua() {
		ModelAndView model = new ModelAndView("index");
		return model;
	}

	@PostMapping("/setLingua")
	public ModelAndView lingua(@RequestParam String lang) {
		ModelAndView model = new ModelAndView(lang);
		return model;
	}
}
