package com.ventas.app.daos;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;

import com.ventas.app.daosinterfaces.IConfiguracionCamiseta;
import com.ventas.app.mappingtables.ConfiguracionCamiseta;

@Stateless
public class ConfiguracionCamisetaBean implements IConfiguracionCamiseta {

	@Override
	public boolean agregaConfCamiseta(EntityManager em, ConfiguracionCamiseta c) {
		em.persist(c);
		return true;
	}

	@Override
	public boolean eliminaConfCamiseta(EntityManager em, int id) {
		ConfiguracionCamiseta c = em.find(ConfiguracionCamiseta.class, id);
		em.remove(c);
		return true;
	}

	@Override
	public ConfiguracionCamiseta buscaConfCamiseta(EntityManager em, int id) {
		ConfiguracionCamiseta c = em.find(ConfiguracionCamiseta.class, id);
		return c;
	}

	@Override
	public List<ConfiguracionCamiseta> listaConfCamiseta(EntityManager em) {
		String sql = "SELECT c FROM configuracion_camisetas";
		return em.createQuery(sql, ConfiguracionCamiseta.class).getResultList();
	}
}
