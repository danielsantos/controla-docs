package com.danielrocha.controladocs.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.danielrocha.controladocs.model.Correspondente;
import com.danielrocha.controladocs.model.Diligencia;
import com.danielrocha.controladocs.service.DiligenciaService;

@Controller
@RequestMapping("/diligencia")
public class DiligenciaController {

	@Autowired
	private DiligenciaService service;

	
	@GetMapping("/add")
	public ModelAndView add(Diligencia diligencia) {
		ModelAndView mv = new ModelAndView("/diligencia/add");
		
		if (diligencia == null)
			mv.addObject("diligencia", new Diligencia());
		else 
			mv.addObject("diligencia", diligencia);
		
		return mv;
	}
	
	@PostMapping("/save")
	public ModelAndView save(@Valid Diligencia diligencia) {
		diligencia.setCorrespondente(new Correspondente(1l));
		diligencia.setSituacao("P");
		service.save(diligencia);
		
		ModelAndView modelAndView = new ModelAndView("home");
		
		List<Diligencia> lista = service.findAll();  
		modelAndView.addObject("lista", lista);
		return modelAndView;
	}
	
	@GetMapping("/edit/{id}")
	public ModelAndView edit(@PathVariable("id") Long id) {
		return add(service.findOne(id));
	}
	
}
