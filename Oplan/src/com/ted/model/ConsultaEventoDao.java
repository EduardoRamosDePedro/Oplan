package com.ted.model;

import java.util.List;

import com.ted.view.Evento;

@FunctionalInterface
public interface ConsultaEventoDao {

	List<Evento> consultarEventos();
	
}
