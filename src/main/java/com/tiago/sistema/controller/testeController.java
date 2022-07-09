package com.tiago.sistema.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.tiago.sistema.model.Usuario;

@Controller
public class testeController {

	@GetMapping("/")
	public String telaLogin(Model model) {
		Usuario usuario = new Usuario();
		model.addAttribute("user", usuario);
		return "login";
	}

//	@GetMapping("/movimentacao")
//	public List<Movimentacao> Movimento(){
//		Movimentacao movimentacao1 = new Movimentacao((long) 1, "CDC1545", "FIAT", LocalDateTime.parse("2018-07-22 10:35:10", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")),  24.04, 35.00);
//		Movimentacao movimentacao2 = new Movimentacao((long) 2, "CCC2222", "Chevrolet", LocalDateTime.parse("2018-08-23 05:35:10", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")), 15.22, 25.00);
//		return Arrays.asList(movimentacao1, movimentacao2);
//	}
}
