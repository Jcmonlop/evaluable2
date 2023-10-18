package com.example.demo.evaluable2.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.evaluable2.entity.Usuario;

import jakarta.persistence.EntityManager;

@Repository
public class UsuarioRepository {
	@Autowired
	private EntityManager em;

	@Transactional(readOnly = true)
	public List<Usuario> findAll() {
		return em.createQuery("from Usuario", Usuario.class).getResultList();
	}
}
