package com.example.demo.repository;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.example.demo.entity.Usuario;

@Component
public class DataBase {
	
	 public static Map<Long,Usuario> listaUsuarios = new HashMap<Long,Usuario>();

	 {
	  System.out.println("Criando banco de dados");
	  listaUsuarios.put( 1L, new Usuario("Marcelo Domingues", "marcelo@gmail.com"));
	  listaUsuarios.put( 2L, new Usuario("Maria Braga", "maria@gmail.com"));
	  listaUsuarios.put( 3L, new Usuario("Anselmo Góis", "anselmo@gmail.com"));
	  listaUsuarios.put( 4L, new Usuario("Dulce Oliveira", "dulce@gmail.com"));
	  listaUsuarios.put( 5L, new Usuario("Bianca de Andrade", "bianca@gmail.com"));
	  listaUsuarios.put( 6L, new Usuario("Roberta Rocco", "roberta@gmail.com"));
	  listaUsuarios.put( 7L, new Usuario("Eduardo Paes", "eduardo@gmail.com"));
	  listaUsuarios.put( 8L, new Usuario("Luiz Inacio Lula da Silva", "lula@gmail.com"));
	  listaUsuarios.put( 9L, new Usuario("Jair Messias Bolsonaro", "bolsonaro@gmail.com"));
	  listaUsuarios.put( 10L, new Usuario("Tadeu Schmidt", "tadeu@gmail.com"));
	  listaUsuarios.put( 11L, new Usuario("Bebeto", "bebeto@gmail.com"));
	  listaUsuarios.put( 12L, new Usuario("Romario", "romario@gmail.com"));
	  System.out.println("Banco de Dados criado");
	 }


}
