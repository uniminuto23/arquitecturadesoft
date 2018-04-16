package com.ventas.app.daos;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;

import com.ventas.app.daosinterfaces.ICliente;
import com.ventas.app.mappingtables.Cliente;

@Stateless
public class ClienteBean implements ICliente {

	@Override
	public List<Cliente> listaClientes(EntityManager em) {
		String sql = "SELECT c FROM cliente c";
		return em.createQuery(sql, Cliente.class).getResultList();
	}

	public boolean agregarCliente(EntityManager em, Cliente c) {
		em.persist(c);
		return true;
	}

	public boolean eliminarCliente(EntityManager em, int id) {
		Cliente c = em.find(Cliente.class, id);
		em.remove(c);
		return true;
	}

	public Cliente buscarCliente(EntityManager em, int id) {
		Cliente c = em.find(Cliente.class, id);
		return c;
	}

}
