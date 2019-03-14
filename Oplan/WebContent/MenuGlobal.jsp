<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
	<link rel="stylesheet" href="assets/css/xoanamain.css" />
</head>
<body>


	<!-- Nav -->
	<div>
						<nav id="nav">
							<ul>
								<li><a href="index.jsp">LOGO</a></li>
								<li>
									<a href="#">CATEGORIA</a>
									<ul>
										<li><a href="#">Categoria 1</a></li>
										<li><a href="#">Categoria 2</a></li>
										<li><a href="#">Categoria 3</a></li>
										<li>
											<a href="#">Categoria 4 &hellip;</a>
											<ul>
												<li><a href="#">Categora A</a></li>
												<li><a href="#">Categora B</a></li>
												<li><a href="#">Categora C</a></li>
												<li><a href="#">Categora D</a></li>
											</ul>
										</li>
										<li><a href="#">Categora 5</a></li>
									</ul>
								</li>
								<li><a href="PreAddEventServlet" target="_blank">CREAR EVENTO</a></li>
								<li><input type="search" onkeypress="myFunction()" name="search" id="search"><input type="image" src="./images/lupaW.png" alt="Enviar" id="lup" >
								</li>

								<li id="log"><a href="#" >LOGIN</a></li>
							</ul>
						</nav>

				</div>
	</body>
</html>