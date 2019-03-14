<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<%@page import="com.ted.view.*"%>
<%@page import="com.ted.controller.Fachada"%>
<!DOCTYPE html>
<html lang="es">

<head>
<meta charset="UTF-8">
<title>Crear evento</title>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/meyer-reset/2.0/reset.min.css">
<link rel="stylesheet" href="css/style.css">
</head>

<body>
	<!-- multistep form -->
	<form id="msform" action="PostAddEventServlet" method="post">

		<!-- progressbar -->

		<ul id="progressbar">
			<li class="active">Email</li>
			<li>Evento</li>
			<li>Tipo de evento</li>
			<li>Compañia</li>
			<li>Crear</li>
		</ul>

		<!-- fieldsets -->

		<fieldset>
			<h2 class="fs-title">Email</h2>
			<h3 class="fs-subtitle">Datos de contacto</h3>
			<input id="email" type="email" name="email" placeholder="Email" required="required"/>
			 
			<input type="button" name="next" class="next action-button" value="Next" />
		</fieldset>

		<fieldset>
			<h2 class="fs-title">Evento</h2>
			<h3 class="fs-subtitle">Datos del evento</h3>
			<input id="evento" type="text" name="evento" placeholder="Evento" />
			<textarea id="descripcion" name="descripcion" placeholder="Descripcion"></textarea>
			<select id="categoria" name="categoria" required="required">
				<option value="0">Sin Categoria</option>
				<% 
				List<Categoria> rs = (List<Categoria>) session.getAttribute("lecturaCategorias");
				for (Categoria categoria : rs) {
				%>
				<option value="<%out.println(categoria.getCodigoCategoria());%>"><%out.println(categoria.getNombreCategoria());%></option>	
				<%
				};
				%> 
			</select>
			
			<select id="provincia" name="provincia" required="required">
				<option value="0">Sin Provincia</option>
				<% 
				List<Provincia> rs2 = (List<Provincia>) session.getAttribute("lecturaProvincias");
				for (Provincia provincia : rs2) {
				%>
				<option value="<%out.println(provincia.getCodigoProvincia());%>"><%out.println(provincia.getNombreProvincia());%></option>	
				<%
				};
				%> 
			</select>
			
			<!--  ruta de imagen desde el escritorio para correcta subida, revisar en el futuro -->
			<input id="imagen" type="file" name="imagen" placeholder="Imagen" />
			<div>
				<input id="fechaini" type="date" name="fechaini" required="required"/> 
				<input id="fechafin" type="date" name="fechafin" required="required"/>
			</div>
			
			<input type="button" name="previous" class="previous action-button" value="Previous" /> 
			<input type="button" name="next" class="next action-button" value="Next" />
		</fieldset>

		<fieldset>
			<h2 class="fs-title">Tipo de evento</h2>
			<h3 class="fs-subtitle">Tipo de evento</h3>
			<textarea id="info" name="info" placeholder="+Info"></textarea>
			<label for="gratuito">Gratuito</label><input type="radio" id="gratuito" name="tipovalor" value="gratis" checked="checked">
			<label for="pago">Pago</label><input type="radio" id="pago" name="tipovalor" value="pago"> 
			<input id="numeropersonas" type="number" name="numeropersonas" placeholder="Numero de personas" value="0"/> 
				
			<input type="button" name="previous" class="previous action-button" value="Previous" /> 
			<input type="button" name="next" class="next action-button" value="Next" />
		</fieldset>

		<fieldset>
			<h2 class="fs-title">Compañia</h2>
			<h3 class="fs-subtitle">Datos de la compañía</h3>
			<input id="company" type="text" name="company" placeholder="Compañia" /> 
			<input id="telefono" type="tel" name="telefono" placeholder="Telefono" /> 
			<input id="web" type="text" name="web" placeholder="Web" /> 
			<input id="twitter" type="text" name="twitter" placeholder="Twitter" /> 
			<input id="facebook" type="text" name="facebook" placeholder="Facebook" /> 
			
			<input type="button" name="previous" class="previous action-button" value="Previous" /> 
			<input type="button" name="next" class="next action-button" value="Next" />
		</fieldset>

		<fieldset>
			<h2 class="fs-title">Crear</h2>
			<h3 class="fs-subtitle">Gracias por confiar en nuestra
				compañia...</h3>
			<textarea id="gracias" name="gracias" placeholder="Gracias" readonly="readonly">Una vez recopilados todos los datos necesarios para la creación de su evento, pasaremos un proceso de validación y nos pondremos en contacto con usted lo antes posible.</textarea>
			<h3>Revise los campos obligatorios:</h3>
			<h3>Email, categoria, provincia, fecha inicio y fecha fin</h3>
			<input type="button" name="previous" class="previous action-button" value="Previous" />
			<input type="submit" name="submit"class="submit action-button" value="Submit" />
		</fieldset>

	</form>

	<script
		src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
	<script
		src='http://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.3/jquery.easing.min.js'></script>
	<script src="js/index.js"></script>

</body>

</html>