package com.example.demo.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Usuario;
import com.example.demo.repository.DataBase;
import com.example.demo.repository.UsuarioRepository;

@Component
public class DataIntializer implements ApplicationListener<ContextRefreshedEvent> {

	@Autowired
	UsuarioRepository userRepository;

	@Autowired
	DataBase dataBase;

	@Override
	public void onApplicationEvent(ContextRefreshedEvent arg0) {

		int opcao = 7;
		long codigo = 2;
		String nome = "rom";
		String novoNome = "Marcelo";
		String email = "eduardo@gmail.com";

		switch (opcao) {
		case 1:
			criarUsuario();
			break;
		case 2:
			findAll();
			break;
		case 3:
			findByName(nome);
			break;
		case 4:
			findById(codigo);
			break;
		case 5:
			deleteUsuario(codigo);
			break;
		case 6:
			alterarUsuario(novoNome, codigo);
			break;
		case 7: 
			findByEmail(email);		
			break;
		case 8:
			findByNomeIgnoreCase(nome);
			break;
		case 9:
			findByNomeIgnoreCaseLike(nome);
			break;
		default:
			break;
		}

	}

	private void findByNomeIgnoreCase(String nome) {

		Usuario usuario = this.userRepository.findByNomeIgnoreCase(nome);
		System.out.println("Nome : " + usuario.getNome());
		
	}
	
	private void findByNomeIgnoreCaseLike(String nome) {

		Usuario usuario = this.userRepository.findByNomeIgnoreCaseLike(nome);
		System.out.println("Nome : " + usuario.getNome());
		
	}

	private void findByEmail(String email) {
		
		Usuario usuario = this.userRepository.findByEmail(email);
		System.out.println("Usuario : " + usuario.getNome());
		System.out.println("Email : " + usuario.getEmail());
		
	}

	private void deleteUsuario(long codigo) 
	{

		this.userRepository.deleteById(codigo);
		System.out.println("Usuario " + codigo + " deletado");

	}

	private void findById(long codigo) {

		
		

	}

	private void findByName(String nome) {

		Usuario usuario = this.userRepository.findByNome(nome);
		if (usuario != null) {
			System.out.println("Nome procurado : " + usuario.getNome());
		}else {
			System.out.println("Não existe usuário com esse nome");
		}

	}

	private void findAll() {

		System.out.println("Buscando todos os usuarios......");
		List<Usuario> listaUsuarios = userRepository.findAll();
		for (Usuario usuario : listaUsuarios) {
			System.out.println("Nome : " + usuario.getNome());
		}

	}

	private void criarUsuario() {

		for (Long chave : this.dataBase.listaUsuarios.keySet()) {

			Usuario user = DataBase.listaUsuarios.get(chave);
			userRepository.save(user);
			System.out.println("Registro criado com sucesso");

		}

	}
	
	private void alterarUsuario(String novoNome, long codigo) {
		
		
		System.out.println("Usuario alterado com sucesso");
	}

}
