package com.desafioCalcMe.service;

import java.util.List;

import com.desafioCalcMe.model.Contato;

public interface ContatoService {
	
	public List<Contato> obterTodos();
	
	public Contato obterPorCodigo(String id);
	
	public Contato criar (Contato contato);

}
