package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.repository.UsuarioRepository;

@Controller
public class UsuarioController {
	
	private UsuarioRepository usuarioRepository;
	
	public UsuarioController(UsuarioRepository userRepository) {
		this.usuarioRepository = userRepository;
	}

	@RequestMapping("/listaUsuarios")
	public String getAllUsuarios(Model model){
		model.addAttribute("listaUsuarios", this.usuarioRepository.findAll());		
		return "listaUsuarios";
	}
}
