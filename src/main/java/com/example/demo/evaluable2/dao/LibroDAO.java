package com.example.demo.evaluable2.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.evaluable2.entity.Libro;

import jakarta.persistence.EntityManager;

@Repository
public class LibroDAO {
	@Autowired
	private EntityManager em;

	@Transactional(readOnly = true)
	public List<Libro> findAll() {
		return em.createQuery("from Libro", Libro.class).getResultList();
	}
}
