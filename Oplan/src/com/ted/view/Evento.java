package com.ted.view;

import java.io.Serializable;

public class Evento implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer idEvento;
	private String emailEvento;
	private String nombreEvento;
	private String descripcionEvento;
	private String codigoCategoriaEvento;
	private String codigoProvinciaEvento;
	private String imagenEvento;
	private String fechaInicioEvento;
	private String fechaFinEvento;
	private String infoEvento;
	private boolean gratuitoEvento;
	private double numeroPersonasEvento;
	private String companyEvento;
	private String telefonoEvento;
	private String webEvento;
	private String twitterEvento;
	private String facebookEvento;
	
	public Evento() {
		super();
	}

	public Evento(Integer idEvento, String emailEvento, String nombreEvento, String descripcionEvento,
			String codigoCategoriaEvento, String codigoProvinciaEvento, String imagenEvento, String fechaInicioEvento,
			String fechaFinEvento, String infoEvento, boolean gratuitoEvento, double numeroPersonasEvento,
			String companyEvento, String telefonoEvento, String webEvento, String twitterEvento,
			String facebookEvento) {
		super();
		this.idEvento = idEvento;
		this.emailEvento = emailEvento;
		this.nombreEvento = nombreEvento;
		this.descripcionEvento = descripcionEvento;
		this.codigoCategoriaEvento = codigoCategoriaEvento;
		this.codigoProvinciaEvento = codigoProvinciaEvento;
		this.imagenEvento = imagenEvento;
		this.fechaInicioEvento = fechaInicioEvento;
		this.fechaFinEvento = fechaFinEvento;
		this.infoEvento = infoEvento;
		this.gratuitoEvento = gratuitoEvento;
		this.numeroPersonasEvento = numeroPersonasEvento;
		this.companyEvento = companyEvento;
		this.telefonoEvento = telefonoEvento;
		this.webEvento = webEvento;
		this.twitterEvento = twitterEvento;
		this.facebookEvento = facebookEvento;
	}

	public Integer getIdEvento() {
		return idEvento;
	}

	public void setIdEvento(Integer idEvento) {
		this.idEvento = idEvento;
	}

	public String getEmailEvento() {
		return emailEvento;
	}

	public void setEmailEvento(String emailEvento) {
		this.emailEvento = emailEvento;
	}

	public String getNombreEvento() {
		return nombreEvento;
	}

	public void setNombreEvento(String nombreEvento) {
		this.nombreEvento = nombreEvento;
	}

	public String getDescripcionEvento() {
		return descripcionEvento;
	}

	public void setDescripcionEvento(String descripcionEvento) {
		this.descripcionEvento = descripcionEvento;
	}

	public String getCodigoCategoriaEvento() {
		return codigoCategoriaEvento;
	}

	public void setCodigoCategoriaEvento(String codigoCategoriaEvento) {
		this.codigoCategoriaEvento = codigoCategoriaEvento;
	}

	public String getCodigoProvinciaEvento() {
		return codigoProvinciaEvento;
	}

	public void setCodigoProvinciaEvento(String codigoProvinciaEvento) {
		this.codigoProvinciaEvento = codigoProvinciaEvento;
	}

	public String getImagenEvento() {
		return imagenEvento;
	}

	public void setImagenEvento(String imagenEvento) {
		this.imagenEvento = imagenEvento;
	}

	public String getFechaInicioEvento() {
		return fechaInicioEvento;
	}

	public void setFechaInicioEvento(String fechaInicioEvento) {
		this.fechaInicioEvento = fechaInicioEvento;
	}

	public String getFechaFinEvento() {
		return fechaFinEvento;
	}

	public void setFechaFinEvento(String fechaFinEvento) {
		this.fechaFinEvento = fechaFinEvento;
	}

	public String getInfoEvento() {
		return infoEvento;
	}

	public void setInfoEvento(String infoEvento) {
		this.infoEvento = infoEvento;
	}

	public boolean isGratuitoEvento() {
		return gratuitoEvento;
	}

	public void setGratuitoEvento(boolean gratuitoEvento) {
		this.gratuitoEvento = gratuitoEvento;
	}

	public double getNumeroPersonasEvento() {
		return numeroPersonasEvento;
	}

	public void setNumeroPersonasEvento(double numeroPersonasEvento) {
		this.numeroPersonasEvento = numeroPersonasEvento;
	}

	public String getCompanyEvento() {
		return companyEvento;
	}

	public void setCompanyEvento(String companyEvento) {
		this.companyEvento = companyEvento;
	}

	public String getTelefonoEvento() {
		return telefonoEvento;
	}

	public void setTelefonoEvento(String telefonoEvento) {
		this.telefonoEvento = telefonoEvento;
	}

	public String getWebEvento() {
		return webEvento;
	}

	public void setWebEvento(String webEvento) {
		this.webEvento = webEvento;
	}

	public String getTwitterEvento() {
		return twitterEvento;
	}

	public void setTwitterEvento(String twitterEvento) {
		this.twitterEvento = twitterEvento;
	}

	public String getFacebookEvento() {
		return facebookEvento;
	}

	public void setFacebookEvento(String facebookEvento) {
		this.facebookEvento = facebookEvento;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Evento [idEvento=" + idEvento + ", emailEvento=" + emailEvento + ", nombreEvento=" + nombreEvento
				+ ", descripcionEvento=" + descripcionEvento + ", codigoCategoriaEvento=" + codigoCategoriaEvento
				+ ", codigoProvinciaEvento=" + codigoProvinciaEvento + ", imagenEvento=" + imagenEvento
				+ ", fechaInicioEvento=" + fechaInicioEvento + ", fechaFinEvento=" + fechaFinEvento + ", infoEvento="
				+ infoEvento + ", gratuitoEvento=" + gratuitoEvento + ", numeroPersonasEvento=" + numeroPersonasEvento
				+ ", companyEvento=" + companyEvento + ", telefonoEvento=" + telefonoEvento + ", webEvento=" + webEvento
				+ ", twitterEvento=" + twitterEvento + ", facebookEvento=" + facebookEvento + "]";
	}
	
}
