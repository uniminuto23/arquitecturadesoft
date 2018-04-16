package com.ventas.app.daos;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;

import com.ventas.app.daosinterfaces.IColores;
import com.ventas.app.mappingtables.Colores;

@Stateless
public class ColoresBean implements IColores {

	@Override
	public boolean ingresaColor(EntityManager em, Colores c) {
		em.persist(c);
		return true;
	}

	@Override
	public List<Colores> listaColores(EntityManager em) {
		String sql = "SELECT c FROM com.ventas.app.mappingtables.Colores c";
		return em.createQuery(sql, Colores.class).getResultList();
	}

	@Override
	public boolean eliminaColor(EntityManager em, int id) {
		Colores c = em.find(Colores.class, id);
		em.remove(c);
		return true;
	}

}
