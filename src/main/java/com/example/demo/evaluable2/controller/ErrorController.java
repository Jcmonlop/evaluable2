package com.example.demo.evaluable2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ErrorController {

	@GetMapping("/div-0")
	public String errorDivisionPorCero() {
		System.out.println(1/0);
		return "";
	}
	
	@GetMapping("/null")
	public String errorNull() {
		String s = null;
		System.out.println(s.concat(s));
		return "";
	}
	
}
