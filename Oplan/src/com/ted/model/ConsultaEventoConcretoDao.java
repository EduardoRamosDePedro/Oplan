package com.ted.model;

import com.ted.view.Evento;

@FunctionalInterface
public interface ConsultaEventoConcretoDao {
	
	Evento consultarEventoConcreto(String idEvento);

}
