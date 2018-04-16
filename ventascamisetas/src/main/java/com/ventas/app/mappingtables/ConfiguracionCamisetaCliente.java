package com.ventas.app.mappingtables;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity(name = "CONFIGURACION_CAMISETAS_CLIENTES")
@PrimaryKeyJoinColumn(name = "id_configuracion")
public class ConfiguracionCamisetaCliente extends ConfiguracionCamiseta {

	@Column(name = "id_cliente")
	private int idCliente;

	@ManyToOne
	@JoinColumn(name = "id_cliente", insertable = false, updatable = false)
	private Cliente cliente;
	
	/*****************************
	 * start getters and setters
	 ****************************/

	public ConfiguracionCamisetaCliente(
			int idCamiseta,
			int idEstampa,
			int idColor,
			int idTalla,
			Timestamp fecha,
			int idCliente){
		super(idCamiseta, idEstampa, idColor, idTalla, fecha);
		this.idCliente=idCliente;
		
	}
	
	public ConfiguracionCamisetaCliente(){
		
	}
	
	public Cliente getCliente(){
		return this.cliente;
	}
	
	public void setCliente(Cliente cliente){
		this.cliente=cliente;
	}
	
	public int getIdCliente() {
		return this.idCliente;
	}

	public void setIdCLiente(int idCliente) {
		this.idCliente = idCliente;
	}

}
