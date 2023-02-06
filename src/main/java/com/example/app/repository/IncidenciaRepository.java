package com.example.app.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.app.entity.Incidencia;

public interface IncidenciaRepository extends PagingAndSortingRepository<Incidencia, Long> {

}
