package com.ventas.app.daos;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.ventas.app.daosinterfaces.IOrdenCompra;
import com.ventas.app.mappingtables.OrdenCompra;

@Stateless
public class OrdenCompraBean implements IOrdenCompra {

	@Override
	public boolean agregaOrdenCompra(EntityManager em, OrdenCompra o) {
		em.persist(o);
		return true;
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<OrdenCompra> buscaOrdenCompra(EntityManager em, int factura) {
		String sql = "SELECT o FROM com.ventas.app.mappingtables.OrdenCompra o WHERE o.idFactura = :fac";
		Query q = em.createQuery(sql);
		q.setParameter("fac", factura);
		return q.getResultList();
	}

	@Override
	public List<OrdenCompra> listaOrdenCompra(EntityManager em) {
		String sql = "FROM com.ventas.app.mappingtables.OrdenCompra o";
		return em.createQuery(sql, OrdenCompra.class).getResultList();
	}
}
