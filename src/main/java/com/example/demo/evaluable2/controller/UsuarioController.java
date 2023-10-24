package com.example.demo.evaluable2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.demo.evaluable2.dao.UsuarioRepository;
import com.example.demo.evaluable2.entity.Usuario;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {

	@Autowired
	private UsuarioRepository usuarioRepository;
	@GetMapping("/all")
	public String m(Model model) {
		Iterable<Usuario> usuarios = usuarioRepository.findAll();
		model.addAttribute("usuarios", usuarios);
		model.addAttribute("titulo", "Listado de usuarios");
		return "usuario/listar";
	}
	
}
