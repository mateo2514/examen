package com.example.app.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.app.entity.Operador;
import com.example.app.repository.OperadorRespository;
import com.example.app.service.OperadorService;

@Service(value = "operadorService")
public class OperadorServiceImpl implements OperadorService {
	
	@Autowired
	private OperadorRespository operadorRespository;

	
	@Transactional
	@Override
	public void save(Operador operador) {
		operadorRespository.save(operador);
		
	}

	@Transactional
	@Override
	public List<Operador> findAll() {
		
		return (List<Operador>) this.operadorRespository.findAll();
	}

	@Override
	public Operador findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Operador update(Long id, Operador operador) {
		// TODO Auto-generated method stub
		return null;
	}

}
