package com.ventas.app.mappingtables;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity(name = "PERSONA")
@Inheritance(strategy = InheritanceType.JOINED)
public class Persona  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id_persona")
	private int idPersona;

	@Column(name = "no_identificacion")
	private String noIdentificacion;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "apellidos")
	private String apellidos;

	@Column(name = "telefono")
	private String telefono;

	@Column(name = "direccion")
	private String direccion;

	@Column(name = "fecha_inscripcion")
	private Timestamp fechaIncripcion;

	/********************************
	 * start the getters and setters
	 ********************************/

	public Persona( 
			String noIdentificacion, 
			String nombre, 
			String apellidos, 
			String telefono,
			String direccion, 
			Timestamp fechaInscripcion) {

		super();
		this.noIdentificacion=noIdentificacion;
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.telefono=telefono;
		this.fechaIncripcion=fechaInscripcion; 
		
	}
	
	public Persona(){
		
	}

	public Timestamp getFechaInscripcion() {
		return this.fechaIncripcion;
	}

	public void setFechaInscripcion(Timestamp fechaInscripcion) {
		this.fechaIncripcion = fechaInscripcion;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getApellidos() {
		return this.apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNoIdentificacion() {
		return this.noIdentificacion;
	}

	public void setNoIdentificacion(String noIdentificacion) {
		this.noIdentificacion = noIdentificacion;
	}

	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}

	public int getIdPersona() {
		return this.idPersona;
	}

}
