package com.desafioCalcMe.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.desafioCalcMe.model.Contato;
import com.desafioCalcMe.repository.ContatoRepository;

@Service
public class ContatoServiceImpls implements ContatoService {

	@Autowired
	private ContatoRepository contatoRepository;
	
	@Override
	public List<Contato> obterTodos() {
		// TODO Auto-generated method stub
		return this.contatoRepository.findAll();
	}

	@Override
	public Contato obterPorCodigo(String id) {
		// TODO Auto-generated method stub
		return contatoRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Funcionario Não Existe"));
	}

	@Override
	public Contato criar(Contato contato) {
		// TODO Auto-generated method stub
		return this.contatoRepository.save(contato);
	}

}
