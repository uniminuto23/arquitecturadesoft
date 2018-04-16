package com.ventas.app.mappingtables;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity(name = "ADMINISTRADOR")
@PrimaryKeyJoinColumn(name = "id_persona")
public class Administrador extends Persona {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "nick")
	private String nick;

	@Column(name = "password")
	private String password;

	public Administrador(
			String noIdentificacion,
			String nombre,
			String apellios,
			String telefono,
			String direccion,
			Timestamp fechaInscripcion,
			String nick,
			String password)
	{
		this.nick=nick;
		this.password=password;
	}
	
	public Administrador(){
		
	}
	
	/*****************************
	 * start getters and setters
	 ****************************/

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

}
