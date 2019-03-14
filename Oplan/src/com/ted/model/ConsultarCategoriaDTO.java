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

import com.ted.view.Categoria;

public class ConsultarCategoriaDTO implements ConsultaCategoriaDao {

	@Override
	public List<Categoria> consultarCategorias() {

		List<Categoria> categoriasDTOs = new ArrayList<Categoria>();

		try {

			Context initContext = new InitialContext();
			Context envContext = (Context) initContext.lookup("java:comp/env");
			DataSource ds = (DataSource) envContext.lookup("jdbc/aex");
			Connection conn = ds.getConnection();

			Statement statement = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			String sql = "SELECT * FROM categoria";
			ResultSet rs = statement.executeQuery(sql);

			if (rs != null) {
				rs.beforeFirst();

				while (rs.next()) {
					int idCategoria = rs.getInt("idcategoria");
					String nombreCategoria= rs.getString("nombrecategoria");
					String codigoCategoria = rs.getString("codigocategoria");
					categoriasDTOs.add(new Categoria(idCategoria, nombreCategoria, codigoCategoria));
				}
			}

		} catch (NamingException ex) {
			System.err.println(ex);
		} catch (SQLException ex1) {
			System.err.println(ex1.getMessage());
		}

		return categoriasDTOs;
	}

}
