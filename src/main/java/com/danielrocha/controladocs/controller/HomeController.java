package com.danielrocha.controladocs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.danielrocha.controladocs.model.Diligencia;
import com.danielrocha.controladocs.service.DiligenciaService;

@Controller
public class HomeController {
	
	@Autowired
	private DiligenciaService service;

	@RequestMapping("/")
	public ModelAndView index() {
		return new ModelAndView("index");
	}
	
	@RequestMapping("/home")
	public ModelAndView home() {
		try {
			ModelAndView modelAndView = new ModelAndView("home");
			
			List<Diligencia> lista = service.findAll();
			modelAndView.addObject("lista", lista);
			return modelAndView;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	@RequestMapping(value = "/home/filtro", method = RequestMethod.POST)
	public ModelAndView filtro(@RequestParam("situacao") String situacao) {
		try {
			ModelAndView modelAndView = new ModelAndView("home");
			
			List<Diligencia> lista = service.findBySituacao(situacao);  
			modelAndView.addObject("lista", lista);
			modelAndView.addObject("situacao", situacao);
			return modelAndView;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
//	@RequestMapping(value = "/home/filtro", method = RequestMethod.GET)
//	public void endereco(@RequestParam("situacao") String situacao) {
//		
//	}
	
}
