package com.danielrocha.controladocs.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.danielrocha.controladocs.model.Diligencia;

public interface DiligenciaRepository extends JpaRepository<Diligencia, Long> {

	@Query("select d from Diligencia d where d.situacao = :situacao")
	List<Diligencia> findBySituacao(@Param("situacao") String situacao);

}
