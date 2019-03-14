package com.ted.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import com.ted.view.Provincia;

public class ConsultarProvinciaDTO implements ConsultaProvinciaDao {

	@Override
	public List<Provincia> consultarProvincias() {

		List<Provincia> provinciasDTOs = new ArrayList<Provincia>();

		try {

			Context initContext = new InitialContext();
			Context envContext = (Context) initContext.lookup("java:comp/env");
			DataSource ds = (DataSource) envContext.lookup("jdbc/aex");
			Connection conn = ds.getConnection();

			Statement statement = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			String sql = "SELECT * FROM provincia";
			ResultSet rs = statement.executeQuery(sql);

			if (rs != null) {
				rs.beforeFirst();

				while (rs.next()) {
					int idProvincia = rs.getInt("idprovincia");
					String nombreProvincia = rs.getString("nombreprovincia");
					String codigoProvincia = rs.getString("codigoprovincia");
					provinciasDTOs.add(new Provincia(idProvincia, nombreProvincia, codigoProvincia));
				}
			}

		} catch (NamingException ex) {
			System.err.println(ex);
		} catch (SQLException ex1) {
			System.err.println(ex1.getMessage());
		}

		return provinciasDTOs;
	}

}
