<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
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
        <h2 class="text-center">Iniciar Sesión</h2>
        
     


        <form class="was-validated" action="ServletLogin" method="POST">
        <div class="mb-3 mt-3">
        <label style="color:white" for="tipo">Vas a acceder como</label>
              <select name="tipo" size="1" id="tipo">
                <option value="usuario" selected>Usuario</option>
                <option value="administrador">Administrador</option>
              </select>
               </div>
          <div class="mb-3 mt-3">
            <label for="email" class="form-label">Introduzca su correo electronico</label>
            <input type="email" class="form-control" id="email" name="correo"  placeholder="Introduzca su correo electronico" required >
            <div class="invalid-feedback">Rellena el correo correctamente  </div>
            <div class="valid-feedback">Correcto</div>
          </div>

          <div class="mb-3 mt-3">
            <label for="pwd" class="form-label">Introduzca una contraseña</label>
            <input type="password" class="form-control" name="password" id="pwd" placeholder="Introduzca una contraseña" required >
            <div class="invalid-feedback">Rellena  la contraseña correctamente  </div>
            <div class="valid-feedback ">Correcto</div>
          </div>
          <div class="mt-3 mb-3">
            <p>¿No estás registrado? <a href="registro.jsp">Regístrate</a></p>
          </div>
          <button type="submit" class="btn btn-primary w-100" name="button">Enviar</button>
        </form>
      </div>

    </div>
  </div>

  </body>
  </html>