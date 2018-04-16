package com.ventas.app.daosinterfaces;

import java.util.List;

import javax.ejb.Local;
import javax.persistence.EntityManager;

import com.ventas.app.mappingtables.Calificacion;

@Local
public interface ICalificacion {

	public List<Calificacion> obtenerCalificacion(EntityManager em);

	public boolean agregaCalificacion(EntityManager em, Calificacion c);

	public boolean eliminaCalificacion(EntityManager em, int id);
}
