package com.ies.baroja;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.Clientes;
import com.model.administradores;
import com.model.comprasProveedor;

import com.model.productos;
import com.model.repartidores;
import com.model.ventasClientes;
import com.bbdd.ConexioBBDD;

public class Controller {
	/**
	 * Consultas para relacionar la base de datos con java
	 */

	private static String sConsultaClientes ="SELECT  * FROM cliente;";
	
	private static String sConsultaRepartidores ="SELECT  * FROM repartidores;";
	private static String sConsultaProductos ="SELECT  * FROM productos;";
	private static String sConsultaComprasProveedor ="SELECT  * FROM comprasProveedor;";
	private static String sConsultaVentasClientes ="SELECT  * FROM ventasClientes;";
	
	/**
	 * Método que sirve para iniciar sesion con el correo y la contraseña 
	 * @param consulta
	 * @return
	 * @throws SQLException
	 */
	public static Clientes loginUsuario(String consulta) throws SQLException {
		String vconsulta = consulta;
		ConexioBBDD miConexion = new ConexioBBDD();
		miConexion.conectar();
		
		Clientes cliente=null;
		try {
			System.out.println(" Se queda en el controllerrrr");
			
			ResultSet resultado = miConexion.ejecutarConsulta(vconsulta);
			
			cliente = new Clientes (null,null,null,null,null,null);
			
			if (resultado.next()) {
				
				cliente.setCorreo_cli(resultado.getString("correo_cli"));
				cliente.setContra_cli(resultado.getString("contra_cli"));
			
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		miConexion.desconectar();
		return cliente;
		
	}
	
	/**
	 * LinkedList de clientes que nos sirve para selecionar todos los atributos de clientes con sus respectivos datos de la base de datos para meterlas en el .jsp
	 * 
	 */
	
	public static LinkedList<Clientes> getClientes() {
		//Objeto con la lista de jugadores
		LinkedList<Clientes> listaClientes = new LinkedList<Clientes>();
		// Primero conectamos a la BBDD
		ConexioBBDD miConexion = new ConexioBBDD();
		try {
			miConexion.conectar();
			// Lanzamos la consulta
			ResultSet rsResultado =
					miConexion.ejecutarConsulta(sConsultaClientes);
			if (rsResultado != null) {
				// Si hay resultado recuperamos los datos (como un FETCHde un CURSOR)
				while (rsResultado.next()) {
					//Creamos un objeto jugador por cada fila de la tabla(cada jugador)
					Clientes cliente = new Clientes(rsResultado.getString("Cod_cli"),rsResultado.getString("correo_cli"),rsResultado.getString("contra_cli"),rsResultado.getString("nom_cli"),rsResultado.getString("ape_cli"),rsResultado.getString("tele_cli") );
					//Lo insertamos en la lista
					listaClientes.add(cliente);
				}
			} else {
				System.out.println("La consulta no devuelve resultados");
			}
			System.out.println("Número de jugadores="+listaClientes.size());
		} catch (SQLException sqlex) {
			System.out.println("Error: " + sqlex.getMessage());
			sqlex.printStackTrace();
		}
		finally {
			miConexion.desconectar();
		}
		return listaClientes;
	}
	
	/**
	 * LinkedList de repartidores que nos sirve para selecionar todos los atributos de repartidores con sus respectivos datos de la base de datos para meterlas en el .jsp y poder crear las tablas de repartidores
	 * 
	 */
	
	public static LinkedList<repartidores> getRepartidores() {
		//Objeto con la lista de jugadores
		LinkedList<repartidores> listaRepartidores = new LinkedList<repartidores>();
		// Primero conectamos a la BBDD
		ConexioBBDD miConexion = new ConexioBBDD();
		try {
			miConexion.conectar();
			// Lanzamos la consulta
			ResultSet rsResultado =
					miConexion.ejecutarConsulta(sConsultaRepartidores);
			if (rsResultado != null) {
				// Si hay resultado recuperamos los datos (como un FETCHde un CURSOR)
				while (rsResultado.next()) {
					//Creamos un objeto jugador por cada fila de la tabla(cada jugador)
					repartidores repartidor = new repartidores(rsResultado.getInt("cod_repa"),rsResultado.getString("nom_repa"),rsResultado.getString("ape_repa"),rsResultado.getString("dir_repa"));
					//Lo insertamos en la lista
					listaRepartidores.add(repartidor);
				}
			} else {
				System.out.println("La consulta no devuelve resultados");
			}
			System.out.println("Número de jugadores="+listaRepartidores.size());
		} catch (SQLException sqlex) {
			System.out.println("Error: " + sqlex.getMessage());
			sqlex.printStackTrace();
		}
		finally {
			miConexion.desconectar();
		}
		return listaRepartidores;
	}

	/**
	 * LinkedList de productos que nos sirve para selecionar todos los atributos de productos con sus respectivos datos de la base de datos para meterlas en el .jsp 
	 * 
	 */
	public static LinkedList<productos> getProductos() {
		//Objeto con la lista de jugadores
		LinkedList<productos> listaProductos = new LinkedList<productos>();
		// Primero conectamos a la BBDD
		ConexioBBDD miConexion = new ConexioBBDD();
		try {
			miConexion.conectar();
			// Lanzamos la consulta
			ResultSet rsResultado =
					miConexion.ejecutarConsulta(sConsultaProductos);
			if (rsResultado != null) {
				// Si hay resultado recuperamos los datos (como un FETCHde un CURSOR)
				while (rsResultado.next()) {
					//Creamos un objeto jugador por cada fila de la tabla(cada jugador)
					productos producto = new productos(rsResultado.getInt("cod_prod"),rsResultado.getString("nom_prod"),rsResultado.getString("nom_cons"),rsResultado.getString("genero_prod"),rsResultado.getInt("precio_prod"),rsResultado.getString("descripcion"),rsResultado.getString("imagenes"));
					//Lo insertamos en la lista
					listaProductos.add(producto);
				}
			} else {
				System.out.println("La consulta no devuelve resultados");
			}
			System.out.println("Número de jugadores="+listaProductos.size());
		} catch (SQLException sqlex) {
			System.out.println("Error: " + sqlex.getMessage());
			sqlex.printStackTrace();
		}
		finally {
			miConexion.desconectar();
		}
		return listaProductos;
	}
	
	/**
	 * LinkedList de comprasProveedor que nos sirve para selecionar todos los atributos de comprasProveedor con sus respectivos datos de la base de datos para meterlas en el .jsp y poder crear las tablas de comprasProveedor
	 * 
	 */
	
	public static LinkedList<comprasProveedor> getComprasProveedor() {
		//Objeto con la lista de jugadores
		LinkedList<comprasProveedor> listaComprasProveedor = new LinkedList<comprasProveedor>();
		// Primero conectamos a la BBDD
		ConexioBBDD miConexion = new ConexioBBDD();
		try {
			miConexion.conectar();
			// Lanzamos la consulta
			ResultSet rsResultado =
					miConexion.ejecutarConsulta(sConsultaComprasProveedor);
			if (rsResultado != null) {
				// Si hay resultado recuperamos los datos (como un FETCHde un CURSOR)
				while (rsResultado.next()) {
					//Creamos un objeto jugador por cada fila de la tabla(cada jugador)
					comprasProveedor compraProveedor = new comprasProveedor(rsResultado.getInt("cod_venta"),rsResultado.getInt("cod_prov"),rsResultado.getInt("cod_prod"),rsResultado.getString("fecha_venta"),rsResultado.getInt("Cant_prod"),rsResultado.getString("Ciudad_cli_venta"), rsResultado.getString("Dir_cli_venta"));
					//Lo insertamos en la lista
					listaComprasProveedor.add(compraProveedor);
				}
			} else {
				System.out.println("La consulta no devuelve resultados");
			}
			System.out.println("Número de jugadores="+listaComprasProveedor.size());
		} catch (SQLException sqlex) {
			System.out.println("Error: " + sqlex.getMessage());
			sqlex.printStackTrace();
		}
		finally {
			miConexion.desconectar();
		}
		return listaComprasProveedor;
	}
	
	/**
	 * LinkedList de ventasClientes que nos sirve para selecionar todos los atributos de ventasClientes con sus respectivos datos de la base de datos para meterlas en el .jsp y poder crear las tablas de ventasClientes
	 * 
	 */
	public static LinkedList<ventasClientes> getVentasClientes() {
		//Objeto con la lista de jugadores
		LinkedList<ventasClientes> listaVentasClientes = new LinkedList<ventasClientes>();
		// Primero conectamos a la BBDD
		ConexioBBDD miConexion = new ConexioBBDD();
		try {
			miConexion.conectar();
			// Lanzamos la consulta
			ResultSet rsResultado =
					miConexion.ejecutarConsulta(sConsultaVentasClientes);
			if (rsResultado != null) {
				// Si hay resultado recuperamos los datos (como un FETCHde un CURSOR)
				while (rsResultado.next()) {
					//Creamos un objeto jugador por cada fila de la tabla(cada jugador)
					ventasClientes ventaClientes = new ventasClientes(rsResultado.getInt("cod_compr"),rsResultado.getInt("cod_prod"),rsResultado.getInt("cod_repa"),rsResultado.getInt("cod_cli"),rsResultado.getString("fecha_compra"));
					//Lo insertamos en la lista
					listaVentasClientes.add(ventaClientes);
				}
			} else {
				System.out.println("La consulta no devuelve resultados");
			}
			System.out.println("Número de jugadores="+listaVentasClientes.size());
		} catch (SQLException sqlex) {
			System.out.println("Error: " + sqlex.getMessage());
			sqlex.printStackTrace();
		}
		finally {
			miConexion.desconectar();
		}
		return listaVentasClientes;
	}
	/**
	 * Método creado para isertar Clientes en la base de datos
	 * @param cliente
	 * @return
	 */
	public static boolean insertarCliente(Clientes cliente) {
		System.out.println("HOLII AQUI SE INSERTA CLIENTES");
		boolean bRes = true;
		// Primero conectamos a la BBDD
		ConexioBBDD miConexion = new ConexioBBDD();
		try {
		miConexion.conectar();
		int iRes = miConexion.insertarCliente(cliente);
		System.out.println("Resultado de insertar el clientes="+iRes);
		} catch (SQLException sqlex) {
		System.out.println("Error: " + sqlex.getMessage());
		sqlex.printStackTrace();
		bRes = false;
		} finally {
		miConexion.desconectar();
		}
		return bRes;
		}
	/**
	 *  Método creado para isertar insertarVentas en la base de datos, pero no funciona
	 * @param ventaClientes
	 * @return
	 */
	
	public static boolean insertarVentas(ventasClientes ventaClientes) {
		System.out.println("HOLII AQUI SE INSERTA Ventas");
		boolean bRes = true;
		// Primero conectamos a la BBDD
		ConexioBBDD miConexion = new ConexioBBDD();
		try {
		miConexion.conectar();
		int iRes = miConexion.insertarVentas(ventaClientes);
		System.out.println("Resultado de insertar la venta="+iRes);
		} catch (SQLException sqlex) {
		System.out.println("Error: " + sqlex.getMessage());
		sqlex.printStackTrace();
		bRes = false;
		} finally {
		miConexion.desconectar();
		}
		return bRes;
		}

	
	/**
	 * LinkedList de productos que nos sirve para selecionar todos los atributos de productos con sus respectivos datos de la base de datos para meterlas en el .jsp 
	 * @param consola
	 * @return
	 */
	public static LinkedList<productos> getImagenes(String consola) {
		//Objeto con la lista de jugadores
		String selecParaConsolas="select * from productos where NOM_CONS='"+consola+"';";
		
		LinkedList<productos> listaProductos = new LinkedList<productos>();
		// Primero conectamos a la BBDD
		ConexioBBDD miConexion = new ConexioBBDD();
		try {
			miConexion.conectar();
			// Lanzamos la consulta
			ResultSet rsResultado =
					miConexion.ejecutarConsulta(selecParaConsolas);
			if (rsResultado != null) {
				// Si hay resultado recuperamos los datos (como un FETCHde un CURSOR)
				while (rsResultado.next()) {
					//Creamos un objeto jugador por cada fila de la tabla(cada jugador)
					productos producto = new productos(rsResultado.getInt("Cod_prod"),rsResultado.getString("nom_prod"),rsResultado.getString("nom_cons"),rsResultado.getString("genero_prod"),rsResultado.getInt("precio_prod"),rsResultado.getString("descripcion"),rsResultado.getString("imagenes") );
					//Lo insertamos en la lista
					listaProductos.add(producto);
				}
			} else {
				System.out.println("La consulta no devuelve resultados");
			}
			System.out.println("Número de juegos="+listaProductos.size());
		} catch (SQLException sqlex) {
			System.out.println("Error: " + sqlex.getMessage());
			sqlex.printStackTrace();
		}
		finally {
			miConexion.desconectar();
		}
		return listaProductos;
	}
	/**
	 * Método para buscar juegos 
	 * @param codigoJuego
	 * @return
	 */
	public static productos productoBuscado(int codigoJuego) {
		//Objeto con la lista de jugadores
		String selecParaConsolas="select * from productos where Cod_prod='"+codigoJuego+"';";
		
		productos producto = null;
		// Primero conectamos a la BBDD
		ConexioBBDD miConexion = new ConexioBBDD();
		try {
			miConexion.conectar();
			// Lanzamos la consulta
			ResultSet rsResultado =
					miConexion.ejecutarConsulta(selecParaConsolas);
			if (rsResultado != null) {
				// Si hay resultado recuperamos los datos (como un FETCHde un CURSOR)
				while (rsResultado.next()) {
					//Creamos un objeto jugador por cada fila de la tabla(cada jugador)
					producto = new productos(rsResultado.getInt("Cod_prod"),rsResultado.getString("nom_prod"),rsResultado.getString("nom_cons"),rsResultado.getString("genero_prod"),rsResultado.getInt("precio_prod"),rsResultado.getString("descripcion"),rsResultado.getString("imagenes") );
					//Lo insertamos en la lista
				}
			} else {
				System.out.println("La consulta no devuelve resultados");
			}
			
		} catch (SQLException sqlex) {
			System.out.println("Error: " + sqlex.getMessage());
			sqlex.printStackTrace();
		}
		finally {
			miConexion.desconectar();
		}
		return producto;
	}
	
	
	/**
	 * Método para iniciar sesión conectandolo con el controller
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

		Clientes cliente;
		cliente = Controller.loginUsuario("SELECT correo_cli, contra_cli from cliente where correo_cli='" + correo + "';");

		String contraBuena = cliente.getContra_cli();

		if (password.equals(contraBuena)) {

			String nombre = cliente.getNom_cli();
			sesion.setAttribute("name", nombre);
			sesion.setAttribute("usuario", correo);

			/* response.sendRedirect("index.jsp o  html"); */

		}  else {
			response.sendRedirect("el HTML QUE TENGAS PARA DAR ERROR");
		}

	}
	
	
	
	
	
	
	
	
	/**
	 * Método para iniciar sesión con administrador conectandolo con el controller 
	 * @param consulta
	 * @return
	 */
	
	

	public static administradores loginAdministrador(String consulta) {
		String vconsulta = consulta;
		ConexioBBDD miConexion = new ConexioBBDD();
		try {
			miConexion.conectar();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		administradores admin = new administradores (null,null);
		try {
			System.out.println(" Se queda en el controllerrrr");
			
			ResultSet resultado = miConexion.ejecutarConsulta(vconsulta);
			
			
			
			if (resultado.next()) {
				
				admin.setCorreo_adm(resultado.getString("correo_adm"));
				admin.setContra_adm(resultado.getString("contra_adm"));
			
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		miConexion.desconectar();
		return admin;
		
	}
	
	
}




