package com.ventas.app.daosinterfaces;

import java.util.List;

import javax.ejb.Local;
import javax.persistence.EntityManager;

import com.ventas.app.mappingtables.TipoCamiseta;

@Local
public interface ITipoCamiseta {

	public boolean agregaTipoCamiseta(EntityManager em, TipoCamiseta t);

	public boolean eliminaTipoCamiseta(EntityManager em, int id);

	public List<TipoCamiseta> listaTiposCamisetas(EntityManager em);
}
