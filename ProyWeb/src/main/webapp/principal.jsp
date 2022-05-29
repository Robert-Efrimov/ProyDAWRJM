<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.model.Clientes"%>
<!doctype html>
<html lang="es">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="Proyecto">
<meta name="author" content="Jose Antequera">

<title>RJM</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.2/dist/css/bootstrap.min.css"
	rel="stylesheet" />
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.2/dist/js/bootstrap.bundle.min.js"></script>




<!-- Bootstrap core CSS -->


<!-- Favicons -->

<meta name="theme-color" content="#7952b3">


<style>
.bd-placeholder-img {
	font-size: 1.125rem;
	text-anchor: middle;
	-webkit-user-select: none;
	-moz-user-select: none;
	user-select: none;
}

@media ( min-width : 768px) {
	.bd-placeholder-img-lg {
		font-size: 3.5rem;
	}
}

body {
	background: url("fondo.png");
	background-size: cover;
}
</style>


<!-- Custom styles for this template -->

<!-- Custom styles for this template -->
<link href="blog.css" rel="stylesheet">
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







	<main class="container" style="margin-top: 120px !important;">
		<div class=" mb-4 rounded bg-dark w-100" style="object-fit: cover;">
			<img src="images/banner_web.png" style="object-fit: cover"
				height="300" class="w-100"></img>
		</div>

		<div class="row mb-2">
		
			<div class="col-md-6">
				<div
					class="row g-0 border rounded overflow-hidden flex-md-row mb-4 shadow-sm h-md-250 position-relative">
					<div
						class="col-md-7 p-4 d-flex flex-column position-static bg-white">
						<strong class="d-inline-block mb-2 opacity-50"
							style="color: purple !important">Descubre los</strong>
						<h3 class="mb-0">MÁS VENDIDOS</h3>
						<hr />
						<p class="card-text mb-auto">Juegazos más comprados del mes</p>
						<a href="#" class="btn btn-secondary w-100"
							style="background-color: purple; border: none">VER MÁS ></a>
					</div>
					<div class="col-md-5 d-none d-lg-block d-flex justify-content-end">
						<img src="images/vg2.jpg" style="object-fit: cover" height="300"
							class="w-100"></img>
					</div>
				</div>
			</div>

			<div class="col-md-6">
				<div
					class="row g-0 border rounded overflow-hidden flex-md-row mb-4 shadow-sm h-md-250 position-relative">
					<div
						class="col-md-7 p-4 d-flex flex-column position-static bg-white">
						<strong class="d-inline-block mb-2 opacity-50"
							style="color: purple !important">Conoce los</strong>
						<h3 class="mb-0">CLÁSICOS</h3>
						<hr />
						<p class="card-text mb-auto">Tu infancia está aquí</p>
						<a href="#" class="btn btn-secondary w-100"
							style="background-color: purple; border: none">VER MÁS ></a>
					</div>
					<div class="col-md-5 d-none d-lg-block d-flex justify-content-end">
						<img src="images/vg1.jpg" style="object-fit: cover" height="300"
							class="w-100"></img>
					</div>
					
				</div>
			</div>
			
			


		</article>





	</main>

	<footer class="bg-dark text-white">
		<div class="container">
			<nav class="row">
				<a href="#"
					class="col-3 text-reset text-uppercase d-flex align-items-center"></a>
				<h1>Estamos para ayudarte:</h1>
				<p>Telefono: 944514213</p>
				<p>Dirección: Calle Navidades 5 cp: 26841</p>
				<p>Redes Sociales:</p>

			</nav>
		</div>
	</footer>



</body>
</html>
