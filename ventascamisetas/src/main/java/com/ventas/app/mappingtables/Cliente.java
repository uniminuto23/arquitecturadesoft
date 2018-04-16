package com.ventas.app.mappingtables;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity(name = "CLIENTE")
@PrimaryKeyJoinColumn(name = "id_persona")
public class Cliente extends Persona {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "no_targeta")
	private String noTargeta;

	@Column(name = "nick")
	private String nick;

	@Column(name = "password")
	private String password;
	
	@OneToMany(mappedBy = "cliente", fetch = FetchType.EAGER)
	private List<ConfiguracionCamisetaCliente> camisetasList;
	
	@OneToMany(mappedBy = "cliente")
	private List<FacturaCompra> facturasCompras;

	public Cliente(
			String noIdentificacion,
			String nombre,
			String apellidos,
			String telefono,
			String direccion,
			Timestamp fechaInscripcion,
			String noTargeta,
			String nick,
			String password){
		super(noIdentificacion, nombre, apellidos, telefono, direccion, fechaInscripcion);
		this.noTargeta=noTargeta;
		this.nick=nick;
		this.password=password;
	}
	
	public Cliente(){
		
	}

	/*****************************
	 * start getters and setters
	 ****************************/

	/*
	 * getter shirt configuration
	 * */
	
	public List<FacturaCompra> getFacturasCompra() {
		return this.facturasCompras;
	}
	
	public List<ConfiguracionCamisetaCliente> getConfCamisetaCliente() {
		return this.camisetasList;
	}

	/*
	 * and getter shirt configuration
	 * */
	
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNick() {
		return this.nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getNoTargeta() {
		return this.noTargeta;
	}

	public void setNoTargeta(String noTargeta) {
		this.noTargeta = noTargeta;
	}

}
