package com.ventas.app.daosinterfaces;

import java.util.List;

import javax.ejb.Local;
import javax.persistence.EntityManager;

import com.ventas.app.mappingtables.ConfiguracionCamiseta;

@Local
public interface IConfiguracionCamiseta {

	public boolean agregaConfCamiseta(EntityManager em, ConfiguracionCamiseta c);

	public boolean eliminaConfCamiseta(EntityManager Em, int id);

	public ConfiguracionCamiseta buscaConfCamiseta(EntityManager em, int id);

	public List<ConfiguracionCamiseta> listaConfCamiseta(EntityManager em);
}
