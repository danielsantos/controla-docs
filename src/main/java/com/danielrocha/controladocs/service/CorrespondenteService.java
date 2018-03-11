package com.danielrocha.controladocs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.danielrocha.controladocs.model.Correspondente;
import com.danielrocha.controladocs.repository.CorrespondenteRepository;

@Service
public class CorrespondenteService {

	@Autowired
	private CorrespondenteRepository repository;

	public List<Correspondente> findAll() {
		return repository.findAll(); 
	}
	
	public Correspondente findOne(Long id) {
		return repository.findOne(id);
	}
	
	public Correspondente save(Correspondente correspondente) {
		return repository.saveAndFlush(correspondente);
	}
	
	public void delete(Long id) {
		repository.delete(id);
	}
	
}
