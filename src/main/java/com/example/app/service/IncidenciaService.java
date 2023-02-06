package com.example.app.service;

import java.util.List;

import com.example.app.entity.Incidencia;

public interface IncidenciaService {

	void save(Incidencia incidencia);

	List<Incidencia> findAll();

	List<Incidencia> findByIdOperador(Long id);

	Incidencia findOneByIdOperador(Long idOperador, Long idIncidencia);

	void delete(Long idOperador, Long idIncidencia);

	Incidencia update(Long idOperador, Long idIncedencia);

}
