package com.ies.baroja;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.Clientes;
import com.model.productos;
import com.model.ventasClientes;




/**
 * Servlet implementation class ServletForm
 */
@WebServlet("/ServletForm")
public class ServletForm extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletForm() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**doGet para devolver datos
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Error: las llamadas GET no están permitidas").append(request.getContextPath());
		try {

			if (request.getParameter("botonDetalle") != null) {
				buscarJuego(request, response);
			} 

		} catch (Exception ex) {
			System.out.println("Error en servlet");
			ex.printStackTrace();
			mostrarError(response);
		}
	}

	/**
	 * doPost para devolver datos
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
/**
 * if para que al meter los datos de nuestro usuario, compruebe con la base de datos y si están bien se conecten pero si no estan bien no
 */
			if (request.getParameter("nombre_ru") != null) {
				System.out.println("Ha pasado por insertar cliente");
				insertarCliente(request, response);
			} else if (request.getParameter("email_ru") != null) {
				
				/*loginUsuario(request, response);*/
			}else if(request.getParameter("cod_compr") != null) {
				insertarVentas(request, response);
			}

		} catch (Exception ex) {
			System.out.println("Error en servlet");
			ex.printStackTrace();
			mostrarError(response);
		}
	}



	private static void insertarCliente(HttpServletRequest request, HttpServletResponse response) throws Exception {
		/** 1- recogida de datos */
		Clientes cliente = new Clientes(null, request.getParameter("email_ru"),request.getParameter("password_ru") , request.getParameter("nombre_ru"),request.getParameter("apellido_ru"), request.getParameter("telefono_ru"));

		/** 2- Insertar jugador en la base de datos */
		boolean bRes = Controller.insertarCliente(cliente);

		/** 3- Mostrar resultado por pantalla */
		if (bRes) {
			response.sendRedirect("index.jsp");

		} else {
			// Mostramos que se ha producido un error
			mostrarError(response);

		}
	}
	
	private static void insertarVentas(HttpServletRequest request, HttpServletResponse response) throws Exception {
		/** 1- recogida de datos */
		ventasClientes ventaClientes = new ventasClientes(Integer.parseInt(request.getParameter("cod_compr")),Integer.parseInt(request.getParameter("cod_prod")) , Integer.parseInt(request.getParameter("cod_repa")),Integer.parseInt(request.getParameter("cod_cli")), request.getParameter("fecha_compra"));

		/** 2- Insertar jugador en la base de datos */
		boolean bRes = Controller.insertarVentas(ventaClientes);

		/** 3- Mostrar resultado por pantalla */
		if (bRes) {
			response.sendRedirect("finpago.jsp");

		} else {
			// Mostramos que se ha producido un error
			mostrarError(response);

		}
	}
	
	private static void buscarJuego(HttpServletRequest request, HttpServletResponse response) throws Exception {
		/** 1- recogida de datos */

		/** 2- Insertar jugador en la base de datos */
		productos producto  = Controller.productoBuscado(Integer.valueOf(request.getParameter("botonDetalle")));

		/** 3- Mostrar resultado por pantalla */
		if (producto != null) {
			HttpSession sesion = request.getSession();
			sesion.setAttribute("productoBuscadoParaVer", producto);
			response.sendRedirect("descripcion.jsp");

		} else {
			// Mostramos que se ha producido un error
			mostrarError(response);

		}
	}
	
	/**
	 * Método creado para ver si hay errores al crear la página
	 * @param response
	 * @throws IOException
	 */

	private static void mostrarError(HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<HTML>\n" + "<HEAD><TITLE>Página de JAGD</TITLE>" + "  <meta charset=\"utf-8\">\r\n"
				+ "  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n"
				+ "  <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n"
				+ "  <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\"></script>\r\n"
				+ "</HEAD>\n" + "<BODY>\n" + "<div class=\"container mt-3\">\n"
				+ "<h1 class=\"text-danger\">Error interno<h1>\n"
				+ "<img src=\"img/error.jpg\" class=\"rounded\" alt=\"error interno\">" + "</div></BODY></HTML>");
		out.close();
	}

}