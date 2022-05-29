<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ page import="com.ies.baroja.Controller" %>
   <%@ page import="com.model.productos" %>
   <%@ page import="java.util.LinkedList" %>
    <%@ page import="javax.servlet.http.HttpSession" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>14-Menu</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.2/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.2/dist/js/bootstrap.bundle.min.js"></script>
  <style >
body{
  background: url("fondo.png");
  background-size: cover;
}
  </style>
</head>
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

<div class="container mt-3" style="margin-top: 120px !important;">
    <div class="row">
		
      <%
     
      productos producto = (productos) sesion.getAttribute("productoBuscadoParaVer");
      out.print("<div class='col-md-4 col-sm-12 border border-dark rounded d-flex justify-content-center' style='background-color: #4e1461'>");
      out.print("<div><img src='"+producto.getImagenes()+"' style='object-fit: cover;'></div>");
      out.print("</div>");
      %>

      <div class="col-md-7 col-sm-12 p-4 border border-dark rounded d-flex flex-column justify-content-between" style="background-color: #4e1461;color: white">
       <div class="">
      <% 
      out.print("<h2>"+producto.getNom_prod()+"</h2>");
      out.print("<h5>Plataforma: "+producto.getNom_cons()+"</h5>");
      out.print("<h5>Género: "+producto.getGenero_prod()+"</h5>");
      out.print("<h5>Precio: "+producto.getPrecio_prod()+"&euro;</h5>");
      %>
        </div>
        <div class="">
              <form class="" action="compra.jsp" method="post">
                <% out.print("<button type = 'submit' name = 'Compra' value='"+producto.getCod_prod()+"'class='w-100 btn btn-danger' style='background-color: #d736ff; border: none; :hover{color: #d736ff; border: 1px solid #d736ff; background-color: black}'>Comprar</button>"); %>
              </form>
        </div>
      </div>


    </div>

    <div class="row mt-3">
      <div class="col-11 border border-dark rounded" style="background-color: #4e1461; color:white"><h5>Descripción: <%out.print(producto.getDescripcion()); %> </h5>
      </div>
      <div class="col-1"></div>
    </div>

</div>


</body>
</html>