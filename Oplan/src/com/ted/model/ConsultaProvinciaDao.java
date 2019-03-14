package com.ted.model;

import java.util.List;

import com.ted.view.Provincia;

@FunctionalInterface
public interface ConsultaProvinciaDao {
	
	List<Provincia> consultarProvincias();

}
