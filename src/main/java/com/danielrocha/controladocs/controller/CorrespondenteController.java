package com.danielrocha.controladocs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.danielrocha.controladocs.model.Correspondente;
import com.danielrocha.controladocs.service.CorrespondenteService;

@Controller
@RequestMapping("/correspondente")
public class CorrespondenteController {
	
	@Autowired
	private CorrespondenteService service;
	
	@RequestMapping("/lista")
	public ModelAndView lista() {
		ModelAndView mv = new ModelAndView("/correspondente/lista");
		List<Correspondente> lista = service.findAll();
		mv.addObject("lista", lista);
		return mv;
	}

}
