package com.example.demo.evaluable2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo.evaluable2.dao.UsuarioRepository;
import com.example.demo.evaluable2.entity.Usuario;
import com.example.demo.evaluable2.service.UsuarioService;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Autowired
	private UsuarioService usuarioService;
	
	@GetMapping("/all")
	public String lista(Model model) {
		Iterable<Usuario> usuarios = usuarioRepository.findAll();
		model.addAttribute("usuarios", usuarios);
		model.addAttribute("titulo", "Listado de usuarios");
		return "usuario/listar";
	}
	
	@GetMapping("/borrar/{id}")
	public String deleteById(@PathVariable Long id, Model model, RedirectAttributes flash) {
		usuarioService.deleteById(id);
		flash.addFlashAttribute("warning", "Usuario borrado con éxito");
		return "redirect:/usuario/all";
	}
	
	@GetMapping("/form-u")
	public String muestraFormVacio(Model model) {
		model.addAttribute("titulo", "Formulario");
		model.addAttribute("usuario", new Usuario());
		model.addAttribute("tituloH1", "Formulario de usuario");
		return "usuario/form-u";
	}
	
	@PostMapping("/form-u")
	public String guardaForm(Usuario usuario, RedirectAttributes flash) {
		usuarioService.save(usuario);
		flash.addFlashAttribute("success", "Usuario guardado con éxito");
		return "redirect:/usuario/all";
	}
	
	@GetMapping("/form-u/{id}")
	public String muestraFormConDatos(@PathVariable Long id, Model model) {
		model.addAttribute("usuario", usuarioService.findById(id));
		model.addAttribute("tituloH1", "Editar datos de usuario");
		return "usuario/form-u";
	}
	
}
