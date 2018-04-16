package com.ventas.app.daosinterfaces;

import javax.ejb.Local;
import javax.persistence.EntityManager;

import com.ventas.app.mappingtables.Artistas;

@Local
public interface IArtista {

	public Artistas buscarArtista(EntityManager em, int id);

	public boolean eliminarArtista(EntityManager em, int id);

	public void agregaArtista(EntityManager em, Artistas a);
}
