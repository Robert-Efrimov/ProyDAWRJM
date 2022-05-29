<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
         <%@ page import="com.model.ventasClientes"%>
	<%@ page import="com.ies.baroja.Controller"%>
	<%@ page import="java.util.LinkedList"%>
<!DOCTYPE html>
<html lang="es">
<head>
  <title>Tablas de ventas</title>
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
 <nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top" style="
background: rgba(255, 255, 255, 0.4) !important;
box-shadow: 0 4px 30px rgba(0, 0, 0, 0.1);
backdrop-filter: blur(5px);
-webkit-backdrop-filter: blur(5px);">
  <div class="container-fluid">
  
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNav">
      <ul class="navbar-nav">
        <li class="nav-item">
          <a class="nav-link" href="tventas.jsp">Tablas ventas de cliente</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="tcompras.jsp">Tablas compras al proveedor</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="trepartidores.jsp">Repartidores</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="tclientes.jsp">Clientes</a>
        </li>
            <li class="nav-item">
          <a class="nav-link" href="tproductos.jsp">Productos</a>
        </li>
        

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


      <a class="p-2 link-secondary" href="index.html">Novedades</a>


    </nav>
  </div>

	<div class="container mt-3" style="margin-top: 120px !important;">
		<div class="row">

			<h1 class="text-center mb-3">Tablas de ventas</h1>
			<hr class="border border-2 border-white mb-5"/>
			<div class="container-fluid">
				<div class="row">
<table class="table table-striped">
							<thead class="table-dark">
								<tr>
									<th>Cod_compr</th>
									<th>Cod_prod</th>
									<th>Cod_repa</th>
									<th>Cod_cli</th>
									<th>Fecha_compra</th>
									
									
								</tr>
							</thead>
							<tbody>
								<%
								 
								LinkedList<ventasClientes> listaVentasClientes = Controller.getVentasClientes();
								for (int i = 0; i < listaVentasClientes.size(); i++) {
									if (i % 2 == 0) {
										out.println("<tr class='table-primary'>");
									} else {
										out.println("<tr class='table-success'>");
									}
									out.println("<td>" + listaVentasClientes.get(i).getCod_compr() + "</td>");
									out.println("<td>" + listaVentasClientes.get(i).getCod_prod() + "</td>");
									out.println("<td>" + listaVentasClientes.get(i).getCod_repa() + "</td>");
									out.println("<td>" + listaVentasClientes.get(i).getCod_cli() + "</td>");
									out.println("<td>" + listaVentasClientes.get(i).getFecha_compra() + "</td>");
									out.println("</tr>");
								}
								%>
							</tbody>
						</table>


		</div>

	</div>

</body>
</html>