package com.example.demo.evaluable2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.evaluable2.dao.LibroRepository;
import com.example.demo.evaluable2.entity.Libro;


@Service
public class LibroService {
	@Autowired
	LibroRepository libroRepository;
	
	public long count() {
		return libroRepository.count();
	}
	
	public boolean existsById(Long id) {
		return libroRepository.existsById(id);
	}
	
	public Iterable<Libro> todosLosLibros() {
		return libroRepository.findAll();
	}
	
	public void deleteAll() {
		libroRepository.deleteAll();
	}
	
	public Optional<Libro> findById(Long id) {
		return libroRepository.findById(id);
	}
	
	public Libro save(Libro libro) {
		return libroRepository.save(libro);
	}
	
	public void deleteById(Long id) {
		libroRepository.deleteById(id);
	}
	
	List<Libro> findByAutor(String autor){
		return libroRepository.findByAutor(autor);
	}
}
