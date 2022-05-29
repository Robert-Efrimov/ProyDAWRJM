<!DOCTYPE html>

<html lang="es">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css%22%3E">

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js">
</script>

</head>
<body>
  <div id="container mt-3">
    <h1 class="text-primary">Bienvenido ${sessionScope.email}</h1>
    
    <%
      HttpSession misesion = request.getSession();

      String email=(String) misesion.getAttribute("email");
      System.out.println("email=" + email);
    %>
    </div>

</body>

</html>