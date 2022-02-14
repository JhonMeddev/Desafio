package com.desafioCalcMe.repository;


import org.springframework.data.mongodb.repository.MongoRepository;


import com.desafioCalcMe.model.Contato;


public interface ContatoRepository extends MongoRepository<Contato, String> {

	
}
