package com.ventas.app.daos;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;

import com.ventas.app.daosinterfaces.ITallas;
import com.ventas.app.mappingtables.Tallas;

@Stateless
public class TallasBean implements ITallas {

	@Override
	public boolean agregaTalla(EntityManager em, Tallas t) {
		em.persist(t);
		return true;
	}

	@Override
	public boolean eliminaTalla(EntityManager em, int id) {
		Tallas t = em.find(Tallas.class, id);
		em.remove(t);
		return true;
	}

	@Override
	public List<Tallas> listaTallas(EntityManager em) {
		String sql = "SELECT t FROM com.ventas.app.mappingtables.Tallas t";
		return em.createQuery(sql, Tallas.class).getResultList();
	}

}
