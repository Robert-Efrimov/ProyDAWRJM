<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ page import="com.ies.baroja.Controller" %>
   <%@ page import="com.model.productos" %>
   <%@ page import="java.util.LinkedList" %>
<!DOCTYPE html>
<html lang="es">
<head>
  <title>Juegos de Nintendo Switch</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.2/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.2/dist/js/bootstrap.bundle.min.js"></script>
</head>
<style>
html{

}
table{
  text-align: center;

}
  img{
    width: 200px;
    height:350px;
  }
  th{
    text-align: center;
  }
  body{
background: url("fondo.png");
background-size: cover;
  color:white;
}
</style>


<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top"
		style="background: rgba(255, 255, 255, 0.4) !important; box-shadow: 0 4px 30px rgba(0, 0, 0, 0.1); backdrop-filter: blur(5px); -webkit-backdrop-filter: blur(5px);">
		<div class="container-fluid">
			<a class="navbar-brand" href="principal.jsp">RMJ-Games</a>
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarNav"
				aria-controls="navbarNav" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div
				class="collapse navbar-collapse d-flex justify-content-between w-100"
				id="navbarNav">
				<div>
					<ul class="navbar-nav">
						<li class="nav-item"><a class="nav-link" href="juegosPC.jsp"><img
								alt="" src="images/STEAM.svg" class="p-1"
								style="width: 42px !important; height: 42px !important">PC</a>
						</li>
						<li class="nav-item"><a class="nav-link" href="juegos.jsp"><img
								alt="" src="images/XBOX.svg" class="p-1"
								style="width: 42px !important; height: 42px !important">XBOX</a>
						</li>
						<li class="nav-item"><a class="nav-link"
							href="juegosPlay.jsp"><img alt="" src="images/play.svg"
								class="p-1"
								style="width: 42px !important; height: 42px !important">PS5</a>
						</li>
						<li class="nav-item"><a class="nav-link"
							href="juegosNintendo.jsp"><img alt=""
								src="images/nintendo.svg" class="p-1"
								style="width: 42px !important; height: 42px !important">Switch</a>
						</li>
					</ul>
				</div>


				<div>
					
				</div>
				<%
      HttpSession sesion = request.getSession();
		 
      out.print("<div class='collapse navbar-collapse d-flex justify-content-end pe-3 align-items-center' id='navbarNav'>");
      out.print("<p class='mt-3 me-3 text-white'>"+sesion.getAttribute("usuario")+"</p>");
      out.print("<a class='nav-link btn btn-danger text-white' href='index.jsp'>Cerrar Sesión</a>");
      out.print("</div>");
      %>

			</div>
	</nav>


      <a class="p-2 link-secondary" href="principal.jsp">Novedades</a>


    </nav>
  </div>

	<div class="container mt-3" style="margin-top: 120px !important;">
		<div class="row">

			<h1 class="text-center mb-3">Juegos de Nintendo Switch</h1>
			<hr class="border border-2 border-white mb-5"/>
			<div class="container-fluid">
				<div class="row">
				<%
							LinkedList<productos> lista = new LinkedList <productos>();
							lista = Controller.getImagenes("Switch");
							for (int i = 0; i<lista.size(); i++){
								for (int j = 0; i<lista.size(); i++){
									for (int k = 0; i<lista.size(); i++){
										out.print("<form action='ServletLogin' method='POST' class='row'>");
										out.print("<div class='col-md-2 col-sm-12 me-1 mb-5 m-2'>");
										out.print("<div style='height: 80px;' class='mb-3'><h4>"+lista.get(i).getNom_prod()+"</h4></div>");
										out.print("<div><img src='"+lista.get(i).getImagenes()+"' style='object-fit: cover'></div>");
										out.print("<p class='text-center mt-3' style='font-size: 18px; font-weight: bold;'>"+lista.get(i).getPrecio_prod()+"&euro;</p>");
										out.print("<button type = 'submit' name = 'botonDetalle' value='"+lista.get(i).getCod_prod()+"'class='w-100 btn btn-danger' style='background-color: #d736ff; border: none; :hover{color: #d736ff; border: 1px solid #d736ff; background-color: black}'>DETALLES PRODUCTO</button>");
										out.print("</div>");
									}
									
								}
								
								
							}
					%>
		</div>

	</div>
	<footer class="bg-dark text-white">
  <div  class="container">
    <nav class="row">
      <a href="#" class="col-3 text-reset text-uppercase d-flex align-items-center"></a>
    <h1>Estamos para ayudarte:</h1>
    <p>Telefono: 944514213</p>
    <p>Dirección: Calle Navidades 5 cp: 26841</p>
    <p>Redes Sociales:</p>
    <ul type="none">
      <li><a href="#"><img id="rs" src="images/lk.png"  alt="linkedin"></a></li>
      <li><a href="#"><img id="rs" src="images/ig.png"  alt="instagram"></a></li>
      <li><a href="#"><img id=rs src="images/fb.png"  alt="facebook"></a></li>
    </ul>
  </nav>
</div>
</footer>
</body>
</html>