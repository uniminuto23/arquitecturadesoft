package com.ventas.app.daosinterfaces;

import java.util.List;

import javax.ejb.Local;
import javax.persistence.EntityManager;

import com.ventas.app.mappingtables.FacturaCompra;

@Local
public interface IFacturaCompra {

	public boolean agregaFacturaCompra(EntityManager em, FacturaCompra f);

	public FacturaCompra buscaFacturaCompra(EntityManager em, int id);

	public List<FacturaCompra> listaFacturaCompra(EntityManager em);

}
