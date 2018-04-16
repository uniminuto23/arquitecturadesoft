package com.ventas.app.daos;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;

import com.ventas.app.daosinterfaces.IAdministrador;
import com.ventas.app.mappingtables.Administrador;

@Stateless
public class AdministradorBean implements IAdministrador {

	@Override
	public int registrarAdmin(EntityManager em, Administrador a) {
		em.persist(a);
		return a.getIdPersona();
	}

	@Override
	public Administrador buscaAdmin(EntityManager em, int id) {
		Administrador ad = em.find(Administrador.class, 1);
		return ad;
	}

	@Override
	public boolean eliminarAdmin(EntityManager em, int id) {
		Administrador ad = em.find(Administrador.class, id);
		em.remove(ad);
		return false;
	}

}
