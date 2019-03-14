package com.ted.model;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.ted.view.Evento;

public class InsertarEventoDTO implements InserccionEventoDao {

	@SuppressWarnings("finally")
	@Override
	public boolean InserccionEvento(Evento evento) throws IOException{
		
		boolean retValue = false;
		PreparedStatement myStmtImg = null;
		FileInputStream input = null;
		String sql  = null;
		int affectedRows, idGenerado;
		
		try {
			
			// Inserccion evento
			Context initContext = new InitialContext();
			Context envContext = (Context) initContext.lookup("java:comp/env");
			DataSource ds = (DataSource) envContext.lookup("jdbc/aex");
			Connection conn = ds.getConnection();
			
			sql = "INSERT INTO evento (emailevento "
						+ ", nombreevento"
						+ ", descripcionevento"
						+ ", codigocategoriaevento"
						+ ", codigoprovinciaevento"

						+ ", fechainicioevento"
						+ ", fechafinevento"

						+ ", infoevento"
						+ ", eventogratuito"
						+ ", numeropersonasevento"
						+ ", companyevento"
						+ ", telefonoevento"
						+ ", webevento"
						+ ", twitterevento"
						+ ", facebookevento) "
					+ " VALUES('" + evento.getEmailEvento()
						+ "','"	+ evento.getNombreEvento()
						+ "','"	+ evento.getDescripcionEvento()
						+ "','"	+ evento.getCodigoCategoriaEvento()
						+ "','"	+ evento.getCodigoProvinciaEvento()
						
						+ "','"	+ evento.getFechaInicioEvento()
						+ "','"	+ evento.getFechaFinEvento()
						
						+ "','"	+ evento.getInfoEvento()
						+ "',"	+ evento.isGratuitoEvento()
						+ ","	+ evento.getNumeroPersonasEvento()
						+ ",'"	+ evento.getCompanyEvento()
						+ "','"	+ evento.getTelefonoEvento()
						+ "','"	+ evento.getWebEvento()
						+ "','"	+ evento.getTwitterEvento()
						+ "','"	+ evento.getFacebookEvento()					
					+ "')"; 
			
			PreparedStatement statement = conn.prepareStatement(sql, java.sql.Statement.RETURN_GENERATED_KEYS);
			affectedRows = statement.executeUpdate();
	
//			affectedRows = conn.prepareStatement(sql, java.sql.Statement.RETURN_GENERATED_KEYS).executeUpdate();		
			
			if (affectedRows == 0) {
				throw new SQLException("No se pudo insertar el registro");
			}
	
			ResultSet generatedKeys = statement.getGeneratedKeys();
			if (generatedKeys.next()) {
				
				// Actualización de imagen
				idGenerado = generatedKeys.getInt(1);
			    sql = "UPDATE evento SET imagenevento=? WHERE idEvento = " + idGenerado;
					
			 	myStmtImg = conn.prepareStatement(sql);

			 	File theFile = new File(evento.getImagenEvento());
			 	input = new FileInputStream(theFile);
			 	myStmtImg.setBinaryStream(1, input);
			 	myStmtImg.executeUpdate();  
			 	
			 	retValue = true;
			}
			
		} catch (Exception e) {
			System.err.println(e.getMessage());
		} finally {
			if (input != null) {
				input.close();
			}
			return retValue;
		}
		
	}

}
