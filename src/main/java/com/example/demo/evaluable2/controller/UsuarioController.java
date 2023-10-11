package com.example.demo.evaluable2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.evaluable2.dao.UsuarioDAO;
import com.example.demo.evaluable2.entity.Usuario;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {

	@Autowired
	private UsuarioDAO usuarioDAO;
	
	public String m(Model model) {
		List<Usuario> usuarios = usuarioDAO.findAll();
		model.addAttribute("usuarios", usuarios);
		model.addAttribute("titulo", "Listado de usuarios");
		return "usuario/listar";
	}
}
