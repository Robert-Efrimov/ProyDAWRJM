package com.ies.baroja;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.Clientes;
import com.model.administradores;
import com.model.productos;

/**
 * Servlet creado para iniciar sesión
 * Servlet implementation class ServletLogin
 */
@WebServlet("/ServletLogin")
public class ServletLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletLogin() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		if (request.getParameter("botonDetalle") != null) {
			try {
				buscarJuego(request, response);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else if(request.getParameter("correo")!=null) {
			try {
				System.out.println("se queda en el try del servlet login");
				login(request,response);
				System.out.println("tras login ");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}

	}
	
	/**
	 * Método para iniciar sesión
	 * @param request
	 * @param response
	 * @throws SQLException
	 * @throws IOException
	 */
	public static void login(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException {
		

			

		HttpSession sesion = request.getSession();
		String correo = request.getParameter("correo");
		String password = request.getParameter("password");
		System.out.println("   se queda en el servletLogin- login " );
		
		
		if(request.getParameter("tipo").equals("usuario")){
			
	
		
		Clientes cliente = Controller.loginUsuario("SELECT correo_cli,contra_cli from cliente where correo_cli='" + correo + "';");

		String contraBuena = cliente.getContra_cli();
		/**
		 * if para conectarse como cliente 
		 */
		if (password.equals(contraBuena)) {
			System.out.println("s buena");
			String nombre = cliente.getNom_cli();
			sesion.setAttribute("name", nombre);
			sesion.setAttribute("usuario", correo);

			response.sendRedirect("principal.jsp"); 

		}  else {
			System.out.println("s mala");
			//response.sendRedirect("el HTML QUE TENGAS PARA DAR ERROR");
			response.sendRedirect("error.html"); 
		}
		}
		/**
		 * Este if sirve para iniciar sesión como administrador si seleccionamos el tipo de administrador
		 */
		if(request.getParameter("tipo").equals("administrador")){
			administradores admin = Controller.loginAdministrador("SELECT correo_adm,contra_adm from admin where correo_adm='" + correo + "';");

			String contraBuena = admin.getContra_adm();

			if (password.equals(contraBuena)) {
				System.out.println("s buena");
				String correoadm = admin.getCorreo_adm();
				
				sesion.setAttribute("usuario", correoadm);

				response.sendRedirect("admin.jsp"); 

			}  else {
				System.out.println("s mala");
				//response.sendRedirect("el HTML QUE TENGAS PARA DAR ERROR");
				response.sendRedirect("error.html"); 
			}	
		}
	}
	/**
	 * Método para selecionar los datos de cada juego en el .jsp
	 * @param request
	 * @param response
	 * @throws Exception
	 */
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
			

		}
	}

}
