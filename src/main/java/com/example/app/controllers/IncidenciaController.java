package com.example.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.app.entity.Incidencia;
import com.example.app.service.IncidenciaService;

@RestController
@RequestMapping("/incidencia")
public class IncidenciaController {

	@Autowired
	private IncidenciaService incidenciaService;

	
	@PostMapping("/save")
	public ResponseEntity<?> save(@RequestBody Incidencia incindencia) {
		incidenciaService.save(incindencia);

		return ResponseEntity.ok().body(HttpStatus.ACCEPTED);
	}
	
	
	@GetMapping("/findidoperador/{id}")
	public ResponseEntity<?> findAll(@PathVariable Long id) {
		return ResponseEntity.ok().body(this.incidenciaService.findByIdOperador(id));
	}
	
	@GetMapping("/findall")
	public ResponseEntity<?> findAll() {
		return ResponseEntity.ok().body(this.incidenciaService.findAll());
	}

}
