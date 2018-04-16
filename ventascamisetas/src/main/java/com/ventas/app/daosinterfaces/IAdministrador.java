package com.ventas.app.daosinterfaces;

import javax.ejb.Local;
import javax.persistence.EntityManager;

import com.ventas.app.mappingtables.Administrador;

@Local
public interface IAdministrador {

	public int registrarAdmin(EntityManager em, Administrador a);

	public Administrador buscaAdmin(EntityManager em, int id);

	public boolean eliminarAdmin(EntityManager em, int id);

}
