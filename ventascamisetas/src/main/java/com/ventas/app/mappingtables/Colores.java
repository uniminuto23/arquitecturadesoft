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

@Entity(name = "COLORES")
public class Colores {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_color")
	private int idColor;

	@Column(name = "descripcion")
	private String descripcion;

	@ManyToMany
	@JoinTable(name = "CONFIGURACION_CAMISETAS", joinColumns = {
			@JoinColumn(name = "id_color") }, inverseJoinColumns = { @JoinColumn(name = "id_camiseta") })
	public List<TipoCamiseta> camisetas;

	@ManyToMany
	@JoinTable(name = "CONFIGURACION_CAMISETAS", joinColumns = {
			@JoinColumn(name = "id_color") }, inverseJoinColumns = { @JoinColumn(name = "id_estampa") })
	public List<Estampas> estampas;

	@ManyToMany
	@JoinTable(name = "CONFIGURACION_CAMISETAS", joinColumns = {
			@JoinColumn(name = "id_color") }, inverseJoinColumns = { @JoinColumn(name = "id_talla") })
	public List<Tallas> tallas;

	/****************************
	 * start getters and setters
	 **************************/

	/*
	 * getters lists group
	 */

	public List<Tallas> getTallas() {
		return this.tallas;
	}

	public List<Estampas> getEstampas() {
		return this.estampas;
	}

	public List<TipoCamiseta> getCamisetas() {
		return this.camisetas;
	}

	/*
	 * end getters lists group
	 */

	public void setIdColor(int idColor) {
		this.idColor = idColor;
	}

	public int getIdColor() {
		return this.idColor;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDescripcion() {
		return this.descripcion;
	}
}
