package com.example.demo.evaluable2.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.evaluable2.entity.Libro;

@Repository
public interface LibroRepository extends CrudRepository<Libro, Long>{
	List<Libro> findByAutor(String autor);
}