<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="com.ies.baroja.Controller" %>
   <%@ page import="com.model.productos" %>
    <%@ page import="com.model.ventasClientes" %>
   <%@ page import="java.util.LinkedList" %>
    <%@ page import="javax.servlet.http.HttpSession" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link href="
https://cdn.jsdelivr.net/npm/bootstrap@5.1.2/dist/css/bootstrap.min.css
" rel="stylesheet">
  <script src="
https://cdn.jsdelivr.net/npm/bootstrap@5.1.2/dist/js/bootstrap.bundle.min.js
"></script>
<style media="screen">
  textarea{
    resize:none;
  }

  body{
background: url("fondo.png");
background-size: cover;
}
</style>
</head>
<body>
  <div class="container-fluid mt-3">
    <div class="row">
      <div class="col-md-4 col-sm-1">

      </div>
       
      <div class="col-md-4 col-sm-10 p-5 rounded text-white" style="background-color: purple !important;">
      
        <h2 class="text-center">Compra</h2>
        <%
      HttpSession sesion = request.getSession();
      productos producto = (productos) sesion.getAttribute("productoBuscadoParaVer");
      out.print("<h2>"+producto.getNom_prod()+"</h2>");
      out.print("<h5>Precio: "+producto.getPrecio_prod()+"&euro;</h5>");
      %>
        <form class="was-validated" action="finpago.html" method="post">
          <div class="mb-3 mt-3">
            <label for="nombre" class="form-label">Nombre del titular</label>
            <input type="text" class="form-control" name="" required pattern="[a-zA-Z]{5,20}" value="">
            <div class="invalid-feedback">Rellena correctamente  </div>
            <div class="valid-feedback">Correcto</div>
          </div>
          <div class="mb-3 mt-3">
            <label for="nombre" class="form-label">Número de la tarjeta ( 16 números)</label>
            <input type="text" class="form-control" name="" required pattern="[0-9]{16}" value="">
            <div class="invalid-feedback">Rellena correctamente  </div>
            <div class="valid-feedback">Correcto</div>
          </div>

          <div class="mb-3 mt-3">
            <label for="nombre" class="form-label">Caducidad(mm/yy)</label>
            <input type="text" class="form-control" name="" required pattern="[0-9]{4}" value="">
            <div class="invalid-feedback">Rellena correctamente  </div>
            <div class="valid-feedback ">Correcto</div>
          </div>

          <div class="mb-3 mt-3">
            <label for="nombre" class="form-label">Código de seguridad/CVV2</label>
            <input type="text" class="form-control" name="" required pattern="[0-9]{3}" value="">
            <div class="invalid-feedback">Rellena correctamente  </div>
            <div class="valid-feedback ">Correcto</div>
          </div>


          <button type = 'submit' name = 'Compra' value=''class='w-100 btn btn-danger' style='background-color: #d736ff; border: none; :hover{color: #d736ff; border: 1px solid #d736ff; background-color: black}'>Comprar</button>
        </form>
      </div>

    </div>
  </div>

  </body>
  </html>