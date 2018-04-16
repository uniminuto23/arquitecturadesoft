package com.ventas.app.mappingtables;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name = "CONFIGURACION_CAMISETAS")
@Inheritance(strategy = InheritanceType.JOINED)
public class ConfiguracionCamiseta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_configuracion")
	private int idConfiguracion;

	@Column(name = "id_camiseta")
	private int idCamiseta;

	@Column(name = "id_estampa")
	private int idEstampa;

	@Column(name = "id_color")
	private int idColor;

	@Column(name = "id_talla")
	private int idTalla;

	@Column(name = "fecha")
	private Timestamp fecha;

	/*
	 * start joined
	 * 
	 */
	@ManyToOne
	@JoinColumn(name = "id_camiseta", insertable = false, updatable = false)
	private TipoCamiseta camiseta;

	@ManyToOne
	@JoinColumn(name = "id_estampa", insertable = false, updatable = false)
	private Estampas estampa;

	@ManyToOne
	@JoinColumn(name = "id_color", insertable = false, updatable = false)
	private Colores color;

	@ManyToOne
	@JoinColumn(name = "id_talla", insertable = false, updatable = false)
	private Tallas talla;

	/*
	 * end joined
	 */

	/*****************************
	 * start setters and getters
	 ****************************/

	public ConfiguracionCamiseta(int idCamiseta, int idEstampa, int idColor, int idTalla, Timestamp fecha) {
		this.idCamiseta = idCamiseta;
		this.idEstampa = idEstampa;
		this.idColor = idColor;
		this.idTalla = idTalla;
		this.fecha = fecha;
	}

	public ConfiguracionCamiseta() {

	}

	public Timestamp getFecha() {
		return this.fecha;
	}

	public void setFecha(Timestamp fecha) {
		this.fecha = fecha;
	}

	public int getIdTalla() {
		return this.idTalla;
	}

	public void setIdTalla(int idTalla) {
		this.idTalla = idTalla;
	}

	public int getIdColor() {
		return this.idColor;
	}

	public void setIdColor(int idColor) {
		this.idColor = idColor;
	}

	public int getIdEstampa() {
		return this.idEstampa;
	}

	public void setIdEstampa(int idEstampa) {
		this.idEstampa = idEstampa;
	}

	public int getIdCamiseta() {
		return this.idCamiseta;
	}

	public void setIdCamiseta(int idCamiseta) {
		this.idCamiseta = idCamiseta;
	}

	public int getIdConfiguracion() {
		return this.idConfiguracion;
	}

	public void setIdConfiguracion(int idConfiguracion) {
		this.idConfiguracion = idConfiguracion;
	}
}
