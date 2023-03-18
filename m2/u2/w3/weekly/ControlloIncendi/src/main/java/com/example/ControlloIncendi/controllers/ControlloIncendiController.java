package com.example.ControlloIncendi.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.ControlloIncendi.models.Incendio;
import com.example.ControlloIncendi.models.Sonda;
import com.example.ControlloIncendi.services.IncendioService;
import com.example.ControlloIncendi.services.SondaService;

@RestController
public class ControlloIncendiController {
	
	@Autowired
	SondaService soSe;
	
	@Autowired
	IncendioService inSe;
	
	@GetMapping("/")
	private String home() {
		return "HOME PAGE VIGILI DEL FUOCO DI JAVA !!";
	}
	
/*
  	i link esatti usciranno in console se l'incendio supera
  	il livello di fuoco 5 
*/
	
	@GetMapping("/alarm/")
	public ModelAndView allarme(@RequestParam(name="idsonda") Long id, 
			@RequestParam(name="lat") double latitudine, 
			@RequestParam(name="lon") double lon, 
			@RequestParam(name="smokelevel") Integer quantitaFumo,
			Model model1, Model model2, Model model3, Model model4, Model model5) {
		ModelAndView mav=new ModelAndView("index");
		Optional<Sonda> sondaObj= soSe.ottieniDaId(id);
		List<Incendio> incendi= inSe.ottieniDaSondaId(id);
		List<Incendio> incendi2= inSe.ottieniDaFumo(quantitaFumo);
		List<Incendio> incendi3 = new ArrayList<>();
		model1.addAttribute("idSonda", sondaObj.get().getId());
		model2.addAttribute("latSonda", sondaObj.get().getLatitudine());
		model3.addAttribute("lonSonda", sondaObj.get().getLongitudine());
		for(int i=0; i<incendi.size(); i++) {
			if(incendi2.contains(incendi.get(i))) {
				incendi3.add(incendi.get(i));
			}
		}
		model4.addAttribute("incendio", incendi3.toString());
		return mav;
	}
	
	//mi serviva per controllare gli incendi
	
//	@GetMapping("/fire")
//	public ResponseEntity<List<Incendio>> getAllPos(){
//		return new ResponseEntity<List<Incendio>>(inSe.ottieniTutti(), HttpStatus.OK);
//	}
	
}
