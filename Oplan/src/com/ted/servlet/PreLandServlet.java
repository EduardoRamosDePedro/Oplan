package com.ted.servlet;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import com.ted.controller.Fachada;

/**
 * Servlet implementation class PreLandServlet
 */
@WebServlet("/PreLandServlet")
public class PreLandServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		Blob photo = null;
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		String query = "SELECT imagenevento FROM evento WHERE imagenevento is not null AND activo <> 0 AND idevento = " + request.getParameter("id");
		ServletOutputStream out = response.getOutputStream();

		try {
			Context initContext = new InitialContext();
			Context envContext = (Context) initContext.lookup("java:comp/env");
			DataSource ds = (DataSource) envContext.lookup("jdbc/aex");
			conn = ds.getConnection();

			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);
			if (rs.next()) {
				photo = rs.getBlob(1);
			} else {
				response.setContentType("text/html");
				out.println("<html><head><title>Person Photo</title></head>");
				out.println("<body><h1>No photo found for id= 001 </h1></body></html>");
				return;
			}

			response.setContentType("image/gif");
			InputStream in = photo.getBinaryStream();
			int length = (int) photo.length();

			int bufferSize = 1024;
			byte[] buffer = new byte[bufferSize];

			while ((length = in.read(buffer)) != -1) {
				//System.out.println("writing " + length + " bytes");
				out.write(buffer, 0, length);
			}

			in.close();
			out.flush();
		} catch (SQLException e) {
			response.setContentType("text/html");
			out.println("<html><head><title>Error: Person Photo</title></head>");
			out.println("<body><h1>Error=" + e.getMessage() + "</h1></body></html>");
			return;
		} catch (Exception e) {
			response.setContentType("text/html");
			out.println("<html><head><title>Person Photo</title></head>");
			out.println("<body><h1>Database Connection Problem.</h1></body></html>");
			return;
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
