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

@Entity(name = "TALLAS")
public class Tallas {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_talla")
	private int idTalla;

	@Column(name = "descripcion")
	private String descripcion;

	@ManyToMany
	@JoinTable(name = "CONFIGURACION_CAMISETAS", joinColumns = {
			@JoinColumn(name = "id_talla") }, inverseJoinColumns = { @JoinColumn(name = "id_camiseta") })
	private List<TipoCamiseta> camisetas;

	@ManyToMany
	@JoinTable(name = "CONFIGURACION_CAMISETAS", joinColumns = {
			@JoinColumn(name = "id_talla") }, inverseJoinColumns = { @JoinColumn(name = "id_estampa") })
	private List<Estampas> estampas;

	@ManyToMany
	@JoinTable(name = "CONFIGURACION_CAMISETAS", joinColumns = {
			@JoinColumn(name = "id_talla") }, inverseJoinColumns = { @JoinColumn(name = "id_color") })
	private List<Colores> colores;

	@ManyToMany
	@JoinTable(name = "CONFIGURACION_CAMISETAS_CLIENTES", joinColumns = {
			@JoinColumn(name = "id_talla") }, inverseJoinColumns = { @JoinColumn(name = "id_cliente") })
	private List<Cliente> clientes;

	/*****************************
	 * start setters and getters
	 ****************************/

	/*
	 * getters lists group
	 * 
	 */
	public List<Cliente> getClientes() {
		return this.clientes;
	}

	public List<Colores> getColores() {
		return this.colores;
	}

	public List<Estampas> getEstampas() {
		return this.estampas;
	}

	public List<TipoCamiseta> getCamisetas() {
		return this.camisetas;
	}

	/*
	 * end getters list group
	 */

	public void setIdTalla(int idTalla) {
		this.idTalla = idTalla;
	}

	public int getIdTalla() {
		return this.idTalla;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDescripcion() {
		return this.descripcion;
	}
}
