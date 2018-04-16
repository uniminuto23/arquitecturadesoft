package com.ventas.app.daosinterfaces;

import java.util.List;

import javax.ejb.Local;
import javax.persistence.EntityManager;

import com.ventas.app.mappingtables.CalificacionesCliente;

@Local
public interface ICalificacionCliente {

	public boolean ingresaCalificacion(EntityManager em, CalificacionesCliente cc);

	public List<CalificacionesCliente> obtenerCalificaciones(EntityManager em);

}
