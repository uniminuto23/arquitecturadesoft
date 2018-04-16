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
import javax.persistence.ManyToOne;

@Entity(name = "ESTAMPAS")
public class Estampas {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_estampa")
	private int idEstampa;

	@Column(name = "descripcion")
	private String descripcion;

	@Column(name = "id_artista")
	private int idartista;

	@ManyToOne
	@JoinColumn(name = "id_artista", insertable = false, updatable = false)
	private Artistas artista;

	@ManyToMany
	@JoinTable(name = "CONFIGURACION_CAMISETAS", joinColumns = {
			@JoinColumn(name = "id_estampa") }, inverseJoinColumns = { @JoinColumn(name = "id_camiseta") })
	private List<TipoCamiseta> camisetas;

	@ManyToMany
	@JoinTable(name = "CONFIGURACION_CAMISETAS", joinColumns = {
			@JoinColumn(name = "id_estampa") }, inverseJoinColumns = { @JoinColumn(name = "id_color") })
	private List<Colores> colores;

	@ManyToMany
	@JoinTable(name = "CONFIGURACION_CAMISETAS", joinColumns = {
			@JoinColumn(name = "id_estampa") }, inverseJoinColumns = { @JoinColumn(name = "id_talla") })
	private List<Tallas> tallas;

	@ManyToMany
	@JoinTable(name = "CONFIGURACION_CAMISETAS_CLIENTES", joinColumns = {
			@JoinColumn(name = "id_estampa") }, inverseJoinColumns = { @JoinColumn(name = "id_cliente") })
	private List<Cliente> clientes;

	/****************************
	 * Start getters and setters
	 ****************************/

	/*
	 * lists getters group
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

	public List<TipoCamiseta> getCamisetas() {
		return this.camisetas;
	}

	/*
	 * end lists getters group
	 */

	public void setIdArtista(int idArtista) {
		this.idartista = idArtista;
	}

	public int getIdArtista() {
		return this.idartista;
	}

	public Artistas getArtista() {
		return this.artista;
	}

	public void setArtista(Artistas artista) {
		this.artista = artista;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getIdEstampa() {
		return this.idEstampa;
	}

	public void setIdEstampa(int idEstampa) {
		this.idEstampa = idEstampa;
	}

}
