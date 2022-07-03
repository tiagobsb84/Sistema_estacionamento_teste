package com.tiago.sistema.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tiago.sistema.model.Movimentacao;
import com.tiago.sistema.model.Usuario;

@RequestMapping("/usuario")
@RestController
public class testeController {

//	@GetMapping("/login")
//	public Usuario login() {
//		Usuario usuario = new Usuario();
//		return usuario;
//	}
//	
//	@GetMapping("/movimentacao")
//	public List<Movimentacao> Movimento(){
//		Movimentacao movimentacao1 = new Movimentacao((long) 1, "CDC1545", "FIAT", LocalDateTime.parse("2018-07-22 10:35:10", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")),  24.04, 35.00);
//		Movimentacao movimentacao2 = new Movimentacao((long) 2, "CCC2222", "Chevrolet", LocalDateTime.parse("2018-08-23 05:35:10", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")), 15.22, 25.00);
//		return Arrays.asList(movimentacao1, movimentacao2);
//	}
}
