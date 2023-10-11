package com.example.demo.evaluable2.entity;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="usuarios")
public class Usuario {
	@Id
	private String nombre;
	private String apellido;
	private String email;
	
	@Column(name="create_at")
	@DateTimeFormat(iso=ISO.DATE)
	private LocalDate createAt;
	
	
	public Usuario(String nombre, String apellido, String email, LocalDate createAt) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.createAt = createAt;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getCreateAt() {
		return createAt;
	}

	public void setCreatAt(LocalDate createAt) {
		this.createAt = createAt;
	}
	
	
	
	
}


