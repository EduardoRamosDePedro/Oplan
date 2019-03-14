package com.ted.view;

public class Provincia {

	private Integer idProvincia;
	private String nombreProvincia;
	private String codigoProvincia;
	
	public Provincia() {
		super();
	}
	
	public Provincia(Integer idProvincia, String nombreProvincia, String codigoProvincia) {
		super();
		this.idProvincia = idProvincia;
		this.nombreProvincia = nombreProvincia;
		this.codigoProvincia = codigoProvincia;
	}

	public Integer getIdProvincia() {
		return idProvincia;
	}

	public void setIdProvincia(Integer idProvincia) {
		this.idProvincia = idProvincia;
	}

	public String getNombreProvincia() {
		return nombreProvincia;
	}

	public void setNombreProvincia(String nombreProvincia) {
		this.nombreProvincia = nombreProvincia;
	}

	public String getCodigoProvincia() {
		return codigoProvincia;
	}

	public void setCodigoProvincia(String codigoProvincia) {
		this.codigoProvincia = codigoProvincia;
	}

	@Override
	public String toString() {
		return "Provincia [idProvincia=" + idProvincia + ", nombreProvincia=" + nombreProvincia + ", codigoProvincia="
				+ codigoProvincia + "]";
	}
	
}
