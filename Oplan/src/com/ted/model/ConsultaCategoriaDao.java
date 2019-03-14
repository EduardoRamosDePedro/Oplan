package com.ted.model;

import java.util.List;

import com.ted.view.Categoria;

@FunctionalInterface
public interface ConsultaCategoriaDao {
	
	List<Categoria> consultarCategorias();

}
