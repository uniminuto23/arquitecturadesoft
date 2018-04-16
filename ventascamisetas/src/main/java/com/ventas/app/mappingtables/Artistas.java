package com.ventas.app.mappingtables;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity(name = "ARTISTA")
@PrimaryKeyJoinColumn(name = "id_persona")
public class Artistas extends Persona {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "nick")
	private String nick;

	@Column(name = "password")
	private String password;
	
	@OneToMany(mappedBy = "artista")
	private List<Estampas> estampas;

	public Artistas(
			String noIdentificacion,
			String nombre,
			String apellidos,
			String telefono,
			String direccion,
			Timestamp fechaInscripcion,
			String nick,
			String password) {

		super(noIdentificacion, nombre, apellidos, telefono, direccion, fechaInscripcion);
		this.nick = nick;
		this.password = password;
	}

	public Artistas() {

	}
	
	public List<Estampas> getEstampas() {
		return this.estampas;
	}

	public void setEstampas(List<Estampas> estampas) {
		this.estampas = estampas;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getNick() {
		return this.nick;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPassword() {
		return this.password;
	}
}
