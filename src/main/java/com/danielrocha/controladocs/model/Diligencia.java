package com.danielrocha.controladocs.model;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Diligencia {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(length = 50)
	private String uuid;

	@Column(length = 100)
	private String nome;
	
	@Column(length = 100)
	private String username;
	
	@Column(length = 2)
	private String uf;
	
	@Column
	private Date prazoEntrega;
	
	@Column(length = 100)
	private String municipio;
	
	@OneToOne
	private Usuario usuario;
	
	@Column
	private String descricao;
	
	@OneToOne
	private Correspondente correspondente;

	/**
	 * P - PENDENTE
	 * A - ATRASO
	 * C - CONCLUIDO
	 * 
	 */
	private String situacao;
	
	private String pathFile;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Correspondente getCorrespondente() {
		return correspondente;
	}

	public void setCorrespondente(Correspondente correspondente) {
		this.correspondente = correspondente;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public String getPathFile() {
		return pathFile;
	}

	public void setPathFile(String pathFile) {
		this.pathFile = pathFile;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public Date getPrazoEntrega() {
		return prazoEntrega;
	}

	public void setPrazoEntrega(Date prazoEntrega) {
		this.prazoEntrega = prazoEntrega;
	}
	
	public String getPrazoEntregaStr() {
		if (prazoEntrega != null)
			return new SimpleDateFormat("dd/MM/yyyy").format(this.prazoEntrega);
		else
			return null;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}
