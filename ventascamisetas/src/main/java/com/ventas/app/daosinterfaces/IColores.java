package com.ventas.app.daosinterfaces;

import java.util.List;

import javax.ejb.Local;
import javax.persistence.EntityManager;

import com.ventas.app.mappingtables.Colores;

@Local
public interface IColores {

	public boolean ingresaColor(EntityManager em, Colores c);

	public List<Colores> listaColores(EntityManager em);

	public boolean eliminaColor(EntityManager em, int id);

}
