package com.ted.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ted.controller.Fachada;
import com.ted.view.Evento;

/**
 * Servlet implementation class PostAddEventServlet
 */
@WebServlet("/PostAddEventServlet")
public class PostAddEventServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PostAddEventServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Fachada
		Fachada fachada = new Fachada();
		
		//Insercción evento (email, provincia...)
		if ((request.getParameter("email") != null) 
				&& (request.getParameter("email").length() > 0) 
				&& (request.getParameter("provincia") != null) 
				&& (request.getParameter("provincia").length() > 0)) {

			boolean esGratuito = false;
			String radioGratisPago = request.getParameter("tipovalor");
			
			if ("gratis".equals(radioGratisPago)) {
				esGratuito = true;
			}
			
			request.getParameter("fechaini");
			
			Evento evento = new Evento(null, 
					request.getParameter("email"), 
					request.getParameter("evento"),
					request.getParameter("descripcion"), 
					request.getParameter("categoria"),
					request.getParameter("provincia"),
					request.getParameter("imagen"),
					request.getParameter("fechaini"),
					request.getParameter("fechafin"),
					request.getParameter("info"), 
					esGratuito, 
					Double.parseDouble(request.getParameter("numeropersonas")),
					request.getParameter("company"), 
					request.getParameter("telefono"), 
					request.getParameter("web"),
					request.getParameter("twitter"), 
					request.getParameter("facebook"));
			
			// Insercción Evento
			request.getSession().setAttribute("insercionEvento", fachada.InserccionEvento(evento));
		}
		
		// Reenvio a Jsp
		request.getRequestDispatcher("index.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
