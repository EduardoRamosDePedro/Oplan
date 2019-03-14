<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="com.ted.view.*"%>
<%@page import="com.ted.controller.Fachada"%>
<!DOCTYPE html>
<html>
<head>
<title>Evento desplegado</title>
<meta charset="utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, user-scalable=no" />
<link rel="stylesheet" href="assets/css/main.css" />
<noscript>
	<link rel="stylesheet" href="assets/css/noscript.css" />
</noscript>
</head>
<body class="no-sidebar">

	<%@include file= "MenuGlobal.jsp" %>
	
	<% 
	Evento evento = (Evento) session.getAttribute("lecturaEventoConcreto");
	%>
	
	<div id="page-wrapper">

		<!-- Encabezado -->
		<div id="header">

			<!-- Clase interna -->
			<div class="inner">
				<header>
					<h1>

<!--	
				<a href="index.html" id="logo">Velero a las islas Cíes</a>
-->

						<a href="index.html" id="logo"><%out.println(evento.getNombreEvento());%></a>
						
					</h1>
				</header>
			</div>
<!-- 
			<nav id="nav">
				<ul>
					<li><a href="index.html">Home</a></li>
					<li><a href="#">Dropdown</a>
						<ul>
							<li><a href="#">Lorem ipsum dolor</a></li>
							<li><a href="#">Magna phasellus</a></li>
							<li><a href="#">Etiam dolore nisl</a></li>
							<li><a href="#">And a submenu &hellip;</a>
								<ul>
									<li><a href="#">Lorem ipsum dolor</a></li>
									<li><a href="#">Phasellus consequat</a></li>
									<li><a href="#">Magna phasellus</a></li>
									<li><a href="#">Etiam dolore nisl</a></li>
								</ul></li>
							<li><a href="#">Veroeros feugiat</a></li>
						</ul></li>
					<li><a href="left-sidebar.html">Left Sidebar</a></li>
					<li><a href="right-sidebar.html">Right Sidebar</a></li>
					<li><a href="no-sidebar.html">No Sidebar</a></li>
				</ul>
			</nav>
 -->
		</div>

		<!-- Main -->
		<div class="wrapper style1">

			<div class="container">
				<article id="main" class="special">
					<header>
						<h2>
							<a href="#">Disfruta de tu viaje a las Cíes cada fin de
								semana</a>
						</h2>

					</header>
					<a href="#" class="image featured"><img
						src="images/veleros.jpg" alt="" />Reserva el tuyo</a>

					<div class="date">
						<script>
							var f = new Date();
							document.write(f.getDate() + "/"
									+ (f.getMonth() + 1) + "/"
									+ f.getFullYear());
						</script>
					</div>
					<section>

						<!-- titulo de menú /base de datos -->
						<p>¿Qué incluye?</p>
						<!-- ventaja 1 -->
						<p>- Pasaje de barco para viaje en velero a las islas Cíes
							cada día a las 09:00 y a las 16:00 de lunes a viernes y 12:00 los
							fines de semana</p>
						<!-- ventaja 2 -->
						<p>- Prohibida la entrada a niños menores de 9 años</p>
						<!-- ventaja 3 -->
						<p>Puedes elegir entre:</p>

						<p>- Reserva estándar: navegación en velero + paradas en la
							ría con tiempos de baño</p>
						<p>- Reserva especial: camarotes VIP con hidromasaje ,
							catering de cocina y actividades particulares tras llegada a la
							isla</p>
						<!-- Fecha -->
					</section>
					<section>
						<header>
							<h3>¿Por qué este plan es para ti?</h3>
						</header>
						<p>Conoce un destino turístico de una gran belleza, visita la
							mejor playa del mundo y disfruta de unos paisajes espectaculares</p>
					</section>
					<div class="helpInfo" contenido=""></div>
					<section>
						Ayuda
						<h5>Envíanos un mail a hola@feverup.com o llámanos al +34 911
							876 636</h5>
					</section>
				</article>
				<hr />

				<h2>Planes similares</h2>
				<div class="row">
					<article class="col-4 col-12-mobile special">
						<!-- Foto 2  -->
						<a href="#" class="image featured"><img
							src="images/buceo_pontevedra.jpg" alt="" />Buceo en la ría de
							Pontevedra</a>

					</article>
					<article class="col-4 col-12-mobile special">
						<a href="#" class="image featured"><img
							src="images/pulpiño.jpg" alt="" />Feria de consumición de pulpo
							en O Carballiño</a>
					</article>
					<article class="col-4 col-12-mobile special">
						<a href="#" class="image featured"><img src="images/kaseo.JPG"
							alt="" />Concierto de Kase o</a>
					</article>
				</div>
			</div>

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