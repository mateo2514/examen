package com.example.app.service.impl;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.app.entity.Incidencia;
import com.example.app.entity.Operador;
import com.example.app.repository.IncidenciaRepository;
import com.example.app.repository.OperadorRespository;
import com.example.app.service.IncidenciaService;

@Service(value = "incidenciaService")
public class IncidenciaServiceImpl implements IncidenciaService {

	@Autowired
	private IncidenciaRepository incidenciaRepository;

	@Autowired
	private OperadorRespository operadorRespository;

	@Override
	public void save(Incidencia incidencia) {
		incidenciaRepository.save(incidencia);

	}

	@Override
	public List<Incidencia> findAll() {

		return (List<Incidencia>) incidenciaRepository.findAll();
	}

	@Override
	public List<Incidencia> findByIdOperador(Long id) {

		
		List<Incidencia> listIncidencia = (List<Incidencia>) this.incidenciaRepository.findAll();

		return listIncidencia.stream()
				.filter((Incidencia incidencia) -> incidencia.getOperadores().get(0).getId() == id)
				.collect(Collectors.toList());
	}

	@Override
	public Incidencia findOneByIdOperador(Long idOperador, Long idIncidencia) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long idOperador, Long idIncidencia) {
		// TODO Auto-generated method stub

	}

	@Override
	public Incidencia update(Long idOperador, Long idIncedencia) {
		// TODO Auto-generated method stub
		return null;
	}

}
