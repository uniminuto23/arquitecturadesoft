package com.ventas.app.daos;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;

import com.ventas.app.daosinterfaces.ICalificacion;
import com.ventas.app.mappingtables.Calificacion;

@Stateless
public class CalificacionBean implements ICalificacion {

	@Override
	public List<Calificacion> obtenerCalificacion(EntityManager em) {
		String sql = "SELECT c FROM com.ventas.app.mappingtables.Calificacion c";
		return em.createQuery(sql, Calificacion.class).getResultList();
	}

	@Override
	public boolean agregaCalificacion(EntityManager em, Calificacion c) {
		em.persist(c);
		return true;
	}

	@Override
	public boolean eliminaCalificacion(EntityManager em, int id) {
		Calificacion c = em.find(Calificacion.class, id);
		em.remove(c);
		return true;
	}

}
