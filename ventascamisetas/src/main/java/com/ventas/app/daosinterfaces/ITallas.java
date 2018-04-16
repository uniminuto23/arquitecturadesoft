package com.ventas.app.daosinterfaces;

import java.util.List;

import javax.ejb.Local;
import javax.persistence.EntityManager;

import com.ventas.app.mappingtables.Tallas;

@Local
public interface ITallas {

	public boolean agregaTalla(EntityManager em, Tallas t);

	public boolean eliminaTalla(EntityManager em, int id);

	public List<Tallas> listaTallas(EntityManager em);
}
