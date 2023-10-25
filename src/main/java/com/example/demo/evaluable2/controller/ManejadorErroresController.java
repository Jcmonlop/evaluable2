package com.example.demo.evaluable2.controller;

import java.time.LocalDate;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ManejadorErroresController {

	@ExceptionHandler(ArithmeticException.class)
	public String divididoPorCeroHadler(ArithmeticException ex, Model model) {
		model.addAttribute("titulo", "Error aritmético");
		model.addAttribute("error", "Error aritmético");
		model.addAttribute("message", ex.getMessage());
		model.addAttribute("status", HttpStatus.INTERNAL_SERVER_ERROR.value());
		model.addAttribute("timestamp", LocalDate.now());
		return "/errores/div-0";
	}
	
	@ExceptionHandler(NullPointerException.class)
	public String nullHandler(NullPointerException ex, Model model) {
		model.addAttribute("titulo", "Error null");
		model.addAttribute("error", "Error null");
		model.addAttribute("message", ex.getMessage());
		model.addAttribute("status", HttpStatus.INTERNAL_SERVER_ERROR.value());
		model.addAttribute("timestamp", LocalDate.now());
		return "/errores/null";
	}
	
}
