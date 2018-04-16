package com.ventas.app.mappingtables;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "CALIFICACION")
public class Calificacion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_calificacion")
	private int idCalificacion;

	@Column(name = "descripcion")
	private String descripcion;

	/*********************************
	 * starts the getters and setters
	 * 
	 *********************************/

	public void setIdCalificacion(int idCalificacion) {
		this.idCalificacion = idCalificacion;
	}

	public int getIdCalificacion() {
		return this.idCalificacion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

}
