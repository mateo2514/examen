package com.example.app.service;

import java.util.List;

import com.example.app.entity.Operador;

public interface OperadorService {
	
	void save(Operador operador);
	
	List<Operador> findAll();
	
	Operador findById(Long id);
	
	void delete(Long id);
	
	Operador update(Long id, Operador operador);

}
