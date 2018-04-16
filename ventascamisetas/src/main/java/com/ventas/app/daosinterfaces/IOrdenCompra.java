package com.ventas.app.daosinterfaces;

import java.util.List;

import javax.ejb.Local;
import javax.persistence.EntityManager;

import com.ventas.app.mappingtables.OrdenCompra;

@Local
public interface IOrdenCompra {

	public boolean agregaOrdenCompra(EntityManager em, OrdenCompra o);

	public List<OrdenCompra> buscaOrdenCompra(EntityManager em, int factura);

	public List<OrdenCompra> listaOrdenCompra(EntityManager em);
}
