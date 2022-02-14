package com.desafioCalcMe.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.desafioCalcMe.model.Contato;
import com.desafioCalcMe.service.ContatoService;



@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/contatos")
public class ContatoController {

	@Autowired
	private ContatoService contatoService;
	
	@GetMapping
	public List<Contato> obterTodos() {
		return this.contatoService.obterTodos();
	}
	
	@GetMapping("/{id}")
	public Contato obterPorCodigo(@PathVariable String id) {
		return this.contatoService.obterPorCodigo(id);
	}
	
	@PostMapping
	public Contato criar(@RequestBody Contato contato) {
		return this.contatoService.criar(contato);
	}
	

}
