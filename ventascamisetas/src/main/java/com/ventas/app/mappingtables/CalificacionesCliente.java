package com.ventas.app.mappingtables;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name = "CALIFICACIONES_CLIENTES")
public class CalificacionesCliente {

	@Id
	private CalificacionesClientesID idCalificacionCliente;

	@Column(name = "descripcion")
	private String descripcion;

	@ManyToOne
	@JoinColumn(name = "id_configuracion", insertable = false, updatable = false)
	private ConfiguracionCamiseta confCamiseta;

	@ManyToOne
	@JoinColumn(name = "id_persona", insertable = false, updatable = false)
	private Persona cliente;

	@ManyToOne
	@JoinColumn(name = "id_calificacion", insertable = false, updatable = false)
	private Calificacion calificacion;

	/****************************
	 * start getters and setters
	 ****************************/

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
