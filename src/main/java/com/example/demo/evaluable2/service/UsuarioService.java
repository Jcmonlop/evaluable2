package com.example.demo.evaluable2.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.evaluable2.dao.UsuarioRepository;
import com.example.demo.evaluable2.entity.Usuario;

@Service
public class UsuarioService {
	@Autowired
	UsuarioRepository usuarioRepository;
	
	public long count() {
		return usuarioRepository.count();
	}
	
	public boolean existsById(Long id) {
		return usuarioRepository.existsById(id);
	}
	
	public Iterable<Usuario> todosLosUsuarios() {
		return usuarioRepository.findAll();
	}
	
	public void deleteAll() {
		usuarioRepository.deleteAll();
	}
	
	public Optional<Usuario> findById(Long id) {
		return usuarioRepository.findById(id);
	}
	
	public Usuario save(Usuario usuario) {
		return usuarioRepository.save(usuario);
	}
	
	public void deleteById(Long id) {
		usuarioRepository.deleteById(id);
	}
}
