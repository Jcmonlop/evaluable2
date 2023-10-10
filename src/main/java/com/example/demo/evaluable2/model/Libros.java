package com.example.demo.evaluable2.model;

public class Libros {

	// propiedades

	private String nombre;
	private String autor;
	private String editorial;
	private int año;
	private int numeroDePaginas;
	private int cantidad;

	// constructor

	public Libros(String nombre, String autor, String editorial, int año, int numeroDePaginas, int cantidad) {
		this.nombre = nombre;
		this.autor = autor;
		this.editorial = editorial;
		this.año = año;
		this.numeroDePaginas = numeroDePaginas;
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

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public int getNumeroDePaginas() {
		return numeroDePaginas;
	}

	public void setNumeroDePaginas(int numeroDePaginas) {
		this.numeroDePaginas = numeroDePaginas;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
}
