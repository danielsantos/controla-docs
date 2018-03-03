package com.danielrocha.controladocs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.danielrocha.controladocs.model.Diligencia;
import com.danielrocha.controladocs.repository.DiligenciaRepository;

@Service
public class DiligenciaService {

	@Autowired
	private DiligenciaRepository repository;

	public List<Diligencia> findAll() {
		return repository.findAll(); 
	}
	
	public Diligencia findOne(Long id) {
		return repository.findOne(id);
	}
	
	public List<Diligencia> findBySituacao(String situacao) {
		return repository.findBySituacao(situacao); 
	}
	
	public Diligencia save(Diligencia diligencia) {
		return repository.saveAndFlush(diligencia);
	}
	
	public void delete(Long id) {
		repository.delete(id);
	}
	
}
