package com.ventas.app.daos;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;

import com.ventas.app.daosinterfaces.IArtista;
import com.ventas.app.mappingtables.Artistas;

@Stateless
public class ArtistaBean implements IArtista {

	@Override
	public void agregaArtista(EntityManager em, Artistas a) {
		em.persist(a);
	}

	@Override
	public Artistas buscarArtista(EntityManager em, int id) {
		Artistas ar = em.find(Artistas.class, id);
		return ar;
	}

	@Override
	public boolean eliminarArtista(EntityManager em, int id) {
		Artistas ar = em.find(Artistas.class, id);
		em.remove(ar);
		return true;
	}
}
