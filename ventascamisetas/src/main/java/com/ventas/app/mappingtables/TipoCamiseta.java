package com.ventas.app.mappingtables;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity(name = "TIPOS_CAMISETAS")
public class TipoCamiseta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_camiseta")
	private int idCamiseta;

	@Column(name = "descripcion")
	private String descripcion;

	@ManyToMany
	@JoinTable(name = "CONFIGURACION_CAMISETAS", joinColumns = {
			@JoinColumn(name = "id_camiseta") }, inverseJoinColumns = { @JoinColumn(name = "id_estampa") })
	private List<Estampas> estampas;

	@ManyToMany
	@JoinTable(name = "CONFIGURACION_CAMISETAS", joinColumns = {
			@JoinColumn(name = "id_camiseta") }, inverseJoinColumns = { @JoinColumn(name = "id_color") })
	private List<Colores> colores;

	@ManyToMany
	@JoinTable(name = "CONFIGURACION_CAMISETAS", joinColumns = {
			@JoinColumn(name = "id_camiseta") }, inverseJoinColumns = { @JoinColumn(name = "id_talla") })
	private List<Tallas> tallas;

	@ManyToMany
	@JoinTable(name = "CONFIGURACION_CAMISETAS", joinColumns = {
			@JoinColumn(name = "id_camiseta") }, inverseJoinColumns = { @JoinColumn(name = "id_cliente") })
	private List<Cliente> clientes;

	/*****************************
	 * start getters and setters
	 ****************************/

	/*
	 * getters lists group
	 */
	public List<Cliente> getClientes() {
		return this.clientes;
	}

	public List<Tallas> getTallas() {
		return this.tallas;
	}

	public List<Colores> getColores() {
		return this.colores;
	}

	public List<Estampas> getEstampas() {
		return this.estampas;
	}
	/*
	 * end getters lists group
	 */

	public void setIdCamiseta(int idCamiseta) {
		this.idCamiseta = idCamiseta;
	}

	public int getIdCamiseta() {
		return this.idCamiseta;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

}
