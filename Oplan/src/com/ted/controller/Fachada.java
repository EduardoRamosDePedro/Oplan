package com.ted.controller;

import java.io.IOException;
import java.util.List;

import com.ted.model.ConsultaCategoriaDao;
import com.ted.model.ConsultaEventoConcretoDTO;
import com.ted.model.ConsultaEventoConcretoDao;
import com.ted.model.ConsultaEventoDao;
import com.ted.model.ConsultaProvinciaDao;
import com.ted.model.ConsultarCategoriaDTO;
import com.ted.model.ConsultarEventoDTO;
import com.ted.model.ConsultarProvinciaDTO;
import com.ted.model.InserccionEventoDao;
import com.ted.model.InsertarEventoDTO;
import com.ted.view.Categoria;
import com.ted.view.Evento;
import com.ted.view.Provincia;

public class Fachada implements InserccionEventoDao, ConsultaEventoDao, ConsultaEventoConcretoDao, ConsultaProvinciaDao, ConsultaCategoriaDao {

	@Override
	public boolean InserccionEvento(Evento evento) throws IOException {
		return new InsertarEventoDTO().InserccionEvento(evento);
	}

	@Override
	public List<Evento> consultarEventos() {
		return new ConsultarEventoDTO().consultarEventos();
	}
	
	@Override
	public Evento consultarEventoConcreto(String idEvento) {
		return new ConsultaEventoConcretoDTO().consultarEventoConcreto(idEvento);
	}
	
	@Override
	public List<Provincia> consultarProvincias() {
		return new ConsultarProvinciaDTO().consultarProvincias();
	}

	@Override
	public List<Categoria> consultarCategorias() {
		return new ConsultarCategoriaDTO().consultarCategorias();
	}

}
