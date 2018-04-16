package com.ventas.app.daosinterfaces;

import java.util.List;

import javax.ejb.Local;
import javax.persistence.EntityManager;

import com.ventas.app.mappingtables.Cliente;

@Local
public interface ICliente {

	public List<Cliente> listaClientes(EntityManager em);

	public boolean agregarCliente(EntityManager em, Cliente c);

	public boolean eliminarCliente(EntityManager em, int id);

	public Cliente buscarCliente(EntityManager em, int id);

}
