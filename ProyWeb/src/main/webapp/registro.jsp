<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
        <h2 class="text-center">Registro</h2>
        <form class="was-validated" action="ServletForm" method="POST">

			<div class="mb-3 mt-3">
            <label for="nombre_ru" class="form-label">Introduzca el nombre</label>
            <input type="text" class="form-control" id="nombre_ru" name="nombre_ru"  placeholder="Introduzca el nombre" pattern="[a-zA-Z]+{3,20}" required>
            <div class="invalid-feedback">Rellena  el nombre correctamente  </div>
            <div class="valid-feedback ">Correcto</div>
          </div>
          
          <div class="mb-3 mt-3">
            <label for="apellido_ru" class="form-label">Introduzca el apellido</label>
            <input type="text" class="form-control" id="apellido_ru" name="apellido_ru" placeholder="Introduzca el apellido" pattern="[a-zA-Z]{3,20}" required>
            <div class="invalid-feedback">Rellena  el apellido correctamente  </div>
            <div class="valid-feedback ">Correcto</div>
          </div>
		
		
          <div class="mb-3 mt-3">
            <label for="email_ru" class="form-label">Introduzca su correo electronico</label>
            <input type="text" class="form-control" id="email_ru" name="email_ru" placeholder="Introduzca su correo electronico" required   pattern="[a-zA-Z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,4}$" >
            <div class="invalid-feedback">Rellena el usario correctamente  </div>
            <div class="valid-feedback">Correcto</div>
          </div>

          <div class="mb-3 mt-3">
            <label for="password_ru" class="form-label">Introduzca una contraseña</label>
            <input type="password" class="form-control" id="password_ru" name="password_ru" placeholder="Introduzca una contraseña" pattern="[a-zA-Z0-9]{5,20}" required >
            <div class="invalid-feedback">Rellena  la contraseña correctamente  </div>
            <div class="valid-feedback ">Correcto</div>
          </div>
          
          <div class="mb-3 mt-3">
            <label for="telefono_ru" class="form-label">Teléfono</label>
            <input type="text" class="form-control" id="telefono_ru" name="telefono_ru" placeholder="Introduzca el teléfono" required  pattern="[a-zA-Z0-9]{9}" >
            <div class="invalid-feedback">Rellena  el Teléfono correctamente  </div>
            <div class="valid-feedback">Correcto</div>
          </div>
          <button type="submit" class="btn btn-primary w-100" name="button">Enviar</button>
        </form>
      </div>

    </div>
  </div>
  
  </body>
  
  </html>
