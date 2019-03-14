<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.List"%>
<%@page import="com.ted.view.*"%>
<%@page import="com.ted.controller.Fachada"%>
<!DOCTYPE HTML>
<!--
	Helios by HTML5 UP
	html5up.net | @ajlkn
	Free for personal and commercial use under the CCA 3.0 license (html5up.net/license)
-->
<html>
	<head>
		<title>Oplan</title>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
		<link rel="stylesheet" href="assets/css/xoanamain.css" />
		<!-- noscript é xra cando o teu navegador non soporta o javascript-->
		<noscript><link rel="stylesheet" href="assets/css/noscript.css" /></noscript>
	</head>
	<body class="homepage is-preload">
	
			<%@include file= "MenuGlobal.jsp" %>

			<!-- Features -->
			<div id="probando"></div>
			<div class="parallax">	</div>
				<div class="wrapper style1">
 
					<section id="features" class="container special">
						<header>
							<h2>Eventos</h2>
							<p>Si existe, está aqui...</p>
						</header>
						<div class="row"> 
			 				<% 
				 			request.getRequestDispatcher("PreLandServletEventos").include(request, response);
							List<Evento> rs = (List<Evento>) session.getAttribute("lecturaEventos");
							for (Evento categoria : rs) {
							%>
							
							<article class="col-4 col-12-mobile special">
								<a href="PreDetailEventServlet?idEvento=<%=categoria.getIdEvento()%>" target="_blank" class="image featured"><img src="PreLandServlet?id=<%=categoria.getIdEvento()%>" alt="" /></a>
									<header>
										<h3><a href="#"><%out.println(categoria.getNombreEvento());%></a></h3>
									</header>
									<p>
										<%out.println(categoria.getDescripcionEvento());%>
									</p>
							</article>
							<%
								};
							%> 
 						</div>
					</section>
				</div>

			<!-- Footer -->
				<div id="footer">
					<div class="container">
						<div class="row">

							<!-- Tweets -->
								<section class="col-4 col-12-mobile">
									<header>
										<h2 class="icon fa-twitter circled"><span class="label">Tweets</span></h2>
									</header>
									<ul class="divided">
										<li>
											<article class="tweet">
												Una web impresionante, muy buen trabajo.
												<span class="timestamp">5 minutes ago</span>
											</article>
										</li>
										<li>
											<article class="tweet">
												La variedad es el distintivo de este espacio
												<span class="timestamp">30 minutes ago</span>
											</article>
										</li>
										<li>
											<article class="tweet">
												Dinámica y con buen gusto
												<span class="timestamp">3 hours ago</span>
											</article>
										</li>
										<li>
											<article class="tweet">
												No tenia plan hasta que descubrí este espacio. Enhorabuena
												<span class="timestamp">5 hours ago</span>
											</article>
										</li>
									</ul>
								</section>

							<!-- Posts -->
								<section class="col-4 col-12-mobile">
									<header>
										<h2 class="icon fa-file circled"><span class="label">Posts</span></h2>
									</header>
									<ul class="divided">
										<li>
											<article class="post stub">
												<header>
													<h3><a href="#">Buscounchollo.com</a></h3>
												</header>
												<span class="timestamp">3 hours ago</span>
											</article>
										</li>
										<li>
											<article class="post stub">
												<header>
													<h3><a href="#">LastMinute.com</a></h3>
												</header>
												<span class="timestamp">2 days ago</span>
											</article>
										</li>
									</ul>
								</section>

							<!-- Photos -->
								<section class="col-4 col-12-mobile">
									<header>
										<h2 class="icon fa-camera circled"><span class="label">Photos</span></h2>
									</header>
									<div class="row gtr-25">
										<div class="col-6">
											<a href="#" class="image fit"><img src="images/EventoBarco.png" alt="" /></a>
										</div>
										<div class="col-6">
											<a href="#" class="image fit"><img src="images/EventoCaballos.png" alt="" /></a>
										</div>
										<div class="col-6">
											<a href="#" class="image fit"><img src="images/EventoCocina.png" alt="" /></a>
										</div>
										<div class="col-6">
											<a href="#" class="image fit"><img src="images/EventoExpo.png" alt="" /></a>
										</div>
										<div class="col-6">
											<a href="#" class="image fit"><img src="images/EventoSenderimos.png" alt="" /></a>
										</div>
										<div class="col-6">
											<a href="#" class="image fit"><img src="images/EventoTorneo.png" alt="" /></a>
										</div>
									</div>
								</section>

						</div>
						<hr />
						<div class="row">
							<div class="col-12">

								<!-- Contact -->
									<section class="contact">
										<header>
											<h3>Quieres seguirnos en nuestras redes sociales?</h3>
										</header>
										<p>Hay dias en los que la rutina aparece y para eso estamos nosotros. Déjate sorprender..!!!.</p>
										<ul class="icons">
											<li><a href="#" class="icon fa-twitter"><span class="label">Twitter</span></a></li>
											<li><a href="#" class="icon fa-facebook"><span class="label">Facebook</span></a></li>
											<li><a href="#" class="icon fa-instagram"><span class="label">Instagram</span></a></li>
											<li><a href="#" class="icon fa-pinterest"><span class="label">Pinterest</span></a></li>
											<li><a href="#" class="icon fa-dribbble"><span class="label">Dribbble</span></a></li>
											<li><a href="#" class="icon fa-linkedin"><span class="label">Linkedin</span></a></li>
										</ul>
									</section>

								<!-- Copyright -->

									<div class="copyright">
										<ul class="menu">
											<li>&copy; Untitled. All rights reserved.</li><li>Design: <a href="http://html5up.net">HTML5 UP</a></li>
										</ul>
									</div>
									
							</div>

						</div>
					</div>
				</div>

		

		<!-- Scripts -->
			<script src="assets/js/jquery.min.js"></script>
			<script src="assets/js/jquery.dropotron.min.js"></script>
			<script src="assets/js/jquery.scrolly.min.js"></script>
			<script src="assets/js/jquery.scrollex.min.js"></script>
			<script src="assets/js/browser.min.js"></script>
			<script src="assets/js/breakpoints.min.js"></script>
			<script src="assets/js/util.js"></script>
			<script src="assets/js/main.js"></script>

	</body>
</html>