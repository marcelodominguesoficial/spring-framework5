package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.example.demo.entity.Usuario;

public interface UsuarioRepository extends MongoRepository<Usuario, Long>{
	
	
	Usuario findByNome(String nome);
	
	@Query("{'email' : ?0}")
	Usuario findByEmail(String email);
	
	Usuario findByNomeIgnoreCase(String nome);
	
	Usuario findByNomeIgnoreCaseLike(String nome);


}
