package com.example.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.app.entity.Operador;
import com.example.app.service.OperadorService;

@RestController
@RequestMapping("/operador")
public class OperadorController {
	
	@Autowired
	private OperadorService operadorService;
	
	@PostMapping("/save")
	public ResponseEntity<?> save(@RequestBody Operador operador) {
		
		operadorService.save(operador);
		return ResponseEntity.ok().body(HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/findall")
	public ResponseEntity<?> findAll() {
		return ResponseEntity.ok().body(this.operadorService.findAll());
	}
	
	

}
