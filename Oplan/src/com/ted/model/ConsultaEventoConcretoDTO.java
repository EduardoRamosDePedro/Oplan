package com.ted.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import com.ted.view.Evento;

public class ConsultaEventoConcretoDTO implements ConsultaEventoConcretoDao {

	@Override
	public Evento consultarEventoConcreto(String idEvento) {
		Evento eventoDTO = null;

		try {

			Context initContext = new InitialContext();
			Context envContext = (Context) initContext.lookup("java:comp/env");
			DataSource ds = (DataSource) envContext.lookup("jdbc/aex");
			Connection conn = ds.getConnection();

			Statement statement = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			String sql = "SELECT * FROM evento WHERE idevento ="+idEvento;
			ResultSet rs = statement.executeQuery(sql);

			if (rs != null) {
				rs.beforeFirst();

				while (rs.next()) {
					String emailEvento = rs.getString("emailevento");
					String nombreEvento = rs.getString("nombreevento");
					String descripcionEvento = rs.getString("descripcionevento");
					String codigoCategoriaEvento = rs.getString("codigoprovinciaevento");
					String codigoProvinciaEvento = rs.getString("codigocategoriaevento");
					String imagenEvento = rs.getString("imagenevento");
					String fechaInicioEvento = rs.getString("fechainicioevento");
					String fechaFinEvento = rs.getString("fechafinevento");
					String infoEvento = rs.getString("infoevento");
					boolean gratuitoEvento = rs.getBoolean("eventogratuito");
					double numeroPersonasEvento = rs.getDouble("numeropersonasevento");
					String companyEvento = rs.getString("companyevento");
					String telefonoEvento = rs.getString("telefonoevento");
					String webEvento = rs.getString("webevento");
					String twitterEvento = rs.getString("twitterevento");
					String facebookEvento = rs.getString("facebookevento");
	
					eventoDTO = new Evento(Integer.parseInt(idEvento), emailEvento, nombreEvento, descripcionEvento, codigoCategoriaEvento, codigoProvinciaEvento, imagenEvento, fechaInicioEvento, fechaFinEvento, infoEvento, gratuitoEvento, numeroPersonasEvento, companyEvento, telefonoEvento, webEvento, twitterEvento, facebookEvento);
										
					}
			}

		} catch (NamingException ex) {
			System.err.println(ex);
		} catch (SQLException ex1) {
			System.err.println(ex1.getMessage());
		}

		return eventoDTO;
	}

}
