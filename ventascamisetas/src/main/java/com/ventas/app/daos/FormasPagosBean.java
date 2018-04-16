package com.ventas.app.daos;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.ventas.app.daosinterfaces.IFormasPagos;
import com.ventas.app.mappingtables.FormasPagos;

@Stateless
public class FormasPagosBean implements IFormasPagos {

	@Override
	public boolean agregaFormaPago(EntityManager em, FormasPagos f) {
		em.merge(f);
		return true;
	}

	@Override
	public boolean EliminaFormaPago(EntityManager em, int id) {
		FormasPagos f = em.find(FormasPagos.class, id);
		em.remove(f);
		return true;
	}

	@Override
	public List<FormasPagos> listaFormasPagos(EntityManager em) {
		String sql = "FROM com.ventas.app.mappingtables.FormasPagos f";
		return em.createQuery(sql, FormasPagos.class).getResultList();
	}

	@Override
	public int retornaConsecutivo(EntityManager em) {
		try {
			String sql = "SELECT MAX(f.idFormasPagos) FROM com.ventas.app.mappingtables.FormasPagos f";
			Query query = em.createQuery(sql);
			int res = (int) query.getSingleResult();
			System.out.println(res);
			return res;
		} catch (Exception e) {
			System.out.println(e + " Error de excepcion");
			return 0;
		}

	}
}
