package com.example.demo.evaluable2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.demo.evaluable2.dao.LibroRepository;
import com.example.demo.evaluable2.entity.Libro;

@Controller
@RequestMapping("/libro")
public class LibroController {

	@Autowired
	private LibroRepository libroRepository;
	@GetMapping("/all")
	public String m(Model model) {
		List<Libro> libros = libroRepository.findAll();
		model.addAttribute("libros", libros);
		model.addAttribute("titulo", "Listado de libros");
		return "libro/listar";
	}

	
}