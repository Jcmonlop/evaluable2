package com.example.demo.evaluable2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping({ "/", "/home", "/home/", "" })
	public String homeHandler(Model model) {
		model.addAttribute("titulo", "Inicio");
		model.addAttribute("tituloH1", "Esta es la página 'Inicio' de la biblioteca");
		model.addAttribute("parrafo", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi egestas lacus quis dolor aliquam,"
				+ " ac suscipit metus blandit. Donec id nibh sit amet augue suscipit egestas. Nunc pretium mauris eget metus aliquam vehicula."
				+ " Aenean vulputate magna eu ligula porta auctor. Donec et nunc quis eros accumsan gravida a quis turpis."
				+ " Nam rutrum arcu nec ex porta, sagittis viverra nunc viverra. Etiam eget sagittis elit. Sed gravida dui in pulvinar iaculis."
				+ " Duis aliquam sem sapien, id imperdiet libero porta et. Nam volutpat auctor ipsum."
				+ " Nam convallis, massa ut vestibulum hendrerit, sapien odio pretium augue, in efficitur est ante ac sapien. Interdum. ");
		return "home";
	}

}
