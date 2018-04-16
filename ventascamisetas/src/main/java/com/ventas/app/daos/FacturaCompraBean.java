package com.ventas.app.daos;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;

import com.ventas.app.daosinterfaces.IFacturaCompra;
import com.ventas.app.mappingtables.FacturaCompra;

@Stateless
public class FacturaCompraBean implements IFacturaCompra {

	@Override
	public boolean agregaFacturaCompra(EntityManager em, FacturaCompra f) {
		em.persist(f);
		return true;
	}

	@Override
	public FacturaCompra buscaFacturaCompra(EntityManager em, int id) {
		FacturaCompra f = em.find(FacturaCompra.class, id);
		return f;
	}

	@Override
	public List<FacturaCompra> listaFacturaCompra(EntityManager em) {
		String sql = "SELECT f FOM com.ventas.app.mappingtables.FacturaCompra f";
		return em.createQuery(sql, FacturaCompra.class).getResultList();
	}
}
