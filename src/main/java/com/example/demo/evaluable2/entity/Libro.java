package com.example.demo.evaluable2.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="libros")
public class Libro {

	// propiedades
	
	@Id
	private int id;
	private String nombre;
	private String autor;
	private int fecha;
	private int cantidad;

	// constructor
	
	public Libro() {
		
	}

	public Libro(int id, String nombre, String autor, int fecha, int cantidad) {
		this.id = id;
		this.nombre = nombre;
		this.autor = autor;
		this.fecha = fecha;
		this.cantidad = cantidad;
	}

	// getters y setters

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getFecha() {
		return fecha;
	}

	public void setFecha(int fecha) {
		this.fecha = fecha;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}
