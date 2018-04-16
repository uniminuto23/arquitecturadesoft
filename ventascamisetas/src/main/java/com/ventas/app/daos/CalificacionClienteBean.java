package com.ventas.app.daos;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;

import com.ventas.app.daosinterfaces.ICalificacionCliente;
import com.ventas.app.mappingtables.CalificacionesCliente;

@Stateless
public class CalificacionClienteBean implements ICalificacionCliente {

	@Override
	public boolean ingresaCalificacion(EntityManager em, CalificacionesCliente cc) {
		em.persist(cc);
		return true;
	}

	@Override
	public List<CalificacionesCliente> obtenerCalificaciones(EntityManager em) {
		String sql = "SELECT c FROM calificaciones_clientes c";
		return em.createQuery(sql, CalificacionesCliente.class).getResultList();
	}

}
