package com.example.demo.evaluable2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo.evaluable2.dao.LibroRepository;
import com.example.demo.evaluable2.entity.Libro;
import com.example.demo.evaluable2.service.LibroService;


@Controller
@RequestMapping("/libro")
public class LibroController {

	@Autowired
	private LibroRepository libroRepository;
	
	@Autowired
	private LibroService libroService;
	
	
	@GetMapping("/all")
	public String lista(Model model) {
		Iterable<Libro> libros = libroRepository.findAll();
		model.addAttribute("libros", libros);
		model.addAttribute("titulo", "Listado de libros");
		return "libro/listar";
	}

	@GetMapping("/borrar/{id}")
	public String deleteById(@PathVariable Long id, Model model, RedirectAttributes flash) {
		libroService.deleteById(id);
		flash.addFlashAttribute("warning", "Libro borrado con éxito");
		return "redirect:/libro/all";
	}
	
	@GetMapping("/form-l")
	public String muestraFormVacio(Model model) {
		model.addAttribute("titulo", "Formulario");
		model.addAttribute("libro", new Libro());
		model.addAttribute("tituloH1", "Formulario de libro");
		return "libro/form-l";
	}
	
	@PostMapping("/form-l")
	public String guardaForm(Libro libro, RedirectAttributes flash) {
		libroService.save(libro);
		flash.addFlashAttribute("success", "Libro guardado con éxito");
		return "redirect:/libro/all";
	}
	
	@GetMapping("/form-l/{id}")
	public String muestraFormConDatos(@PathVariable Long id, Model model) {
		model.addAttribute("libro", libroService.findById(id));
		model.addAttribute("tituloH1", "Editar datos del libro");
		return "libro/form-l";
	}
	
	@GetMapping("/listar")
    public String listaFiltrada(Model model, @RequestParam(required = false) String autor) {
        Iterable<Libro> libros;
        if (autor != null) {
            libros = libroRepository.findByAutor(autor);
        } else {
            libros = libroRepository.findAll();
        }
        model.addAttribute("libros", libros);
        model.addAttribute("titulo", "Listado de libros");
        return "libro/listar";
    }
	
}