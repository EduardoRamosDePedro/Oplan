package com.ted.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ted.controller.Fachada;

/**
 * Servlet implementation class PreAddEventServlet
 */
@WebServlet({"/PreAddEventServlet"})
public class PreAddEventServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public PreAddEventServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		// Fachada
		Fachada fachada = new Fachada();
		
		// Lectura Categorias
		request.getSession().setAttribute("lecturaCategorias", fachada.consultarCategorias());
				
		// Lectura Provincias
		request.getSession().setAttribute("lecturaProvincias", fachada.consultarProvincias());
		
		// Reenvio a Jsp
		request.getRequestDispatcher("newevent.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}