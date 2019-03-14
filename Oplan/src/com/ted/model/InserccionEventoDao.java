package com.ted.model;

import java.io.IOException;

import com.ted.view.Evento;

@FunctionalInterface
public interface InserccionEventoDao {
	
	boolean InserccionEvento(Evento evento) throws IOException;

}
