package com.ventas.app.mappingtables;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "FORMAS_PAGOS")
public class FormasPagos {

	@Id
	@Column(name = "id_forma_pago")
	private int idFormasPagos;

	@Column(name = "descripcion")
	private String descripcion;

	/*********************************
	 * starts the getters and setters
	 * 
	 *********************************/

	public void setIdFormasPagos(int idFormasPagos) {
		this.idFormasPagos = idFormasPagos;
	}

	public int getIdFormasPagos() {
		return this.idFormasPagos;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDescripcion() {
		return this.descripcion;
	}
}
