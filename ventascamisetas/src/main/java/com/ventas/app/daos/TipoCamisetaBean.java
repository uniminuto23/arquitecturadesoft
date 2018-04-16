package com.ventas.app.daos;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;

import com.ventas.app.daosinterfaces.ITipoCamiseta;
import com.ventas.app.mappingtables.TipoCamiseta;

@Stateless
public class TipoCamisetaBean implements ITipoCamiseta {

	@Override
	public boolean agregaTipoCamiseta(EntityManager em, TipoCamiseta t) {
		em.persist(t);
		return true;
	}

	@Override
	public boolean eliminaTipoCamiseta(EntityManager em, int id) {
		TipoCamiseta t = em.find(TipoCamiseta.class, id);
		em.remove(t);
		return true;
	}

	@Override
	public List<TipoCamiseta> listaTiposCamisetas(EntityManager em) {
		String sql = "FROM com.ventas.app.mappingtables.TipoCamiseta t";
		return em.createQuery(sql, TipoCamiseta.class).getResultList();
	}

}
