package com.ventas.app.daos;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;

import com.ventas.app.daosinterfaces.IConfiguracionCamisetaCliente;
import com.ventas.app.mappingtables.ConfiguracionCamisetaCliente;

@Stateless
public class ConfiguracionCamisetaClienteBean implements IConfiguracionCamisetaCliente {

	@Override
	public boolean agregaConfCamiCliente(EntityManager em, ConfiguracionCamisetaCliente c) {
		em.persist(c);
		return true;
	}

	@Override
	public boolean eliminaConfCamiCliente(EntityManager em, int id) {
		ConfiguracionCamisetaCliente c = em.find(ConfiguracionCamisetaCliente.class, id);
		em.remove(c);
		return true;
	}

	@Override
	public ConfiguracionCamisetaCliente buscaConfCamiCliente(EntityManager em, int id) {
		ConfiguracionCamisetaCliente c = em.find(ConfiguracionCamisetaCliente.class, id);
		return c;
	}

	@Override
	public List<ConfiguracionCamisetaCliente> listaConfCamiCliente(EntityManager em) {
		String sql = "SELECT c FROM com.ventas.app.mappingtables.ConfiguracionCamisetaCliente c";
		return em.createQuery(sql, ConfiguracionCamisetaCliente.class).getResultList();
	}
}
