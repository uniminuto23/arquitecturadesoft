package com.ventas.app.daos;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.ventas.app.daosinterfaces.IEstampas;
import com.ventas.app.mappingtables.Estampas;

@Stateless
public class EstampasBean implements IEstampas {

	@Override
	public boolean agregaEstampa(EntityManager em, Estampas e) {
		em.merge(e);
		System.out.println(e.getIdEstampa());
		return true;
	}

	@Override
	public boolean eliminaEstampa(EntityManager em, int id) {
		Estampas e = em.find(Estampas.class, id);
		em.remove(e);
		return true;
	}

	@Override
	public List<Estampas> listaEstampa(EntityManager em) {
		String sql = "SELECT e FROM com.ventas.app.mappingtables.Estampas e";
		return em.createQuery(sql, Estampas.class).getResultList();
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Estampas> buscaEstampa(EntityManager em, int idArtista) {
		String sql = "SELECT e FROM com.ventas.app.mappingtables.Estampas e WHERE e.artista = :id";
		Query q = em.createQuery(sql);
		q.setParameter("id", idArtista);
		return (List<Estampas>) q.getResultList();
	}

}
