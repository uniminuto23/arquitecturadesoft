package com.ventas.app.mappingtables;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class CalificacionesClientesID implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "id_camiseta")
	private int idCamiseta;

	@Column(name = "id_cliente")
	private int idCliente;

	@Column(name = "id_calificacion")
	private int idCalificacion;

	/*****************************
	 * Start getters and setters
	 ****************************/

	public int getIdCalificacion() {
		return this.idCalificacion;
	}

	public void setIdCalificacion(int idCalificacion) {
		this.idCalificacion = idCalificacion;
	}

	public int getIdCliente() {
		return this.idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public int getIdCamiseta() {
		return this.idCamiseta;
	}

	public void setIdCamiseta(int idCamiseta) {
		this.idCamiseta = idCamiseta;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idCalificacion;
		result = prime * result + idCamiseta;
		result = prime * result + idCliente;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CalificacionesClientesID other = (CalificacionesClientesID) obj;
		if (idCalificacion != other.idCalificacion)
			return false;
		if (idCamiseta != other.idCamiseta)
			return false;
		if (idCliente != other.idCliente)
			return false;
		return true;
	}

}
