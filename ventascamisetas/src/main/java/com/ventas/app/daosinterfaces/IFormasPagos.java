package com.ventas.app.daosinterfaces;

import java.util.List;

import javax.ejb.Local;
import javax.persistence.EntityManager;

import com.ventas.app.mappingtables.FormasPagos;

@Local
public interface IFormasPagos {

	public boolean agregaFormaPago(EntityManager em, FormasPagos f);

	public boolean EliminaFormaPago(EntityManager em, int id);

	public List<FormasPagos> listaFormasPagos(EntityManager em);

	public int retornaConsecutivo(EntityManager em);
}
