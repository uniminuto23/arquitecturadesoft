package com.ventas.app.daosinterfaces;

import java.util.List;

import javax.ejb.Local;
import javax.persistence.EntityManager;

import com.ventas.app.mappingtables.Estampas;

@Local
public interface IEstampas {

	public boolean agregaEstampa(EntityManager em, Estampas e);

	public boolean eliminaEstampa(EntityManager em, int id);

	public List<Estampas> listaEstampa(EntityManager em);

	public List<Estampas> buscaEstampa(EntityManager em, int idArtista);

}
