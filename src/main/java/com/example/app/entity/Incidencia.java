package com.example.app.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "INCIDENCIAS")
public class Incidencia implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "NOMBRE_INCIDENCIA")
	private String nombreIncidencia;

	@Column(name = "FECHA_INCIDENCIA")
	private Date fechaIncidencia = Calendar.getInstance().getTime();

	@OneToMany(fetch = FetchType.LAZY)
	private List<Operador> operadores;

	public Incidencia() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Incidencia(Long id, String nombreIncidencia, Date fechaIncidencia, List<Operador> operadores) {
		super();
		operadores = new ArrayList<Operador>();
		this.id = id;
		this.nombreIncidencia = nombreIncidencia;
		this.fechaIncidencia = fechaIncidencia;
		this.operadores = operadores;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombreIncidencia() {
		return nombreIncidencia;
	}

	public void setNombreIncidencia(String nombreIncidencia) {
		this.nombreIncidencia = nombreIncidencia;
	}

	public Date getFechaIncidencia() {
		return fechaIncidencia;
	}

	public void setFechaIncidencia(Date fechaIncidencia) {
		this.fechaIncidencia = fechaIncidencia;
	}

	public List<Operador> getOperadores() {
		return operadores;
	}

	public void setOperadores(List<Operador> operadores) {
		this.operadores = operadores;
	}

}
