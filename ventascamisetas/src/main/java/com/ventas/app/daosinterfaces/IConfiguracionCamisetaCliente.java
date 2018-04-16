package com.ventas.app.daosinterfaces;

import java.util.List;

import javax.ejb.Local;
import javax.persistence.EntityManager;

import com.ventas.app.mappingtables.ConfiguracionCamisetaCliente;

@Local
public interface IConfiguracionCamisetaCliente {

	public boolean agregaConfCamiCliente(EntityManager em, ConfiguracionCamisetaCliente c);

	public boolean eliminaConfCamiCliente(EntityManager em, int id);

	public ConfiguracionCamisetaCliente buscaConfCamiCliente(EntityManager em, int id);

	public List<ConfiguracionCamisetaCliente> listaConfCamiCliente(EntityManager em);
}
