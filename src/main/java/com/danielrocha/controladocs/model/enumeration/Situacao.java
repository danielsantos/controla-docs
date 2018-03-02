package com.danielrocha.controladocs.model.enumeration;

public enum Situacao {
	
	ATIVO("A"), INATIVO("I");
	
	private final String codigo;
	
	Situacao(String codigo) {
		this.codigo = codigo;
	}
	
	public String getCodigo() {
		return codigo;
	}

}
