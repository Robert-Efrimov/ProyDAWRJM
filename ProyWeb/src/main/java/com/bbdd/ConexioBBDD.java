package com.bbdd;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.Clientes;
import com.model.ventasClientes;



/**
 * Clase que centraliza los métodos de acceso a BBDD
 * 
 * @author JAGD
 * @since 27/05/2021
 */

public class ConexioBBDD {

	/**
	 * La clase para conectarse a la base de datos
	 */
	Connection conexion; 
	int port = 3306;
	String host= "localhost";
	String db  = "proyectoDAW";
	String user="root";
	String password="";

	String url = String.format("jdbc:mysql://%s:%d/%s?useSSL=false", host, port, db);

	public void conectar() throws SQLException {
		conexion =  DriverManager.getConnection(url, user, password);
	}

	/**
	 * La clase para desconectar  a la base de datos
	 */

	public void desconectar() {
		try {
			conexion.close();
		} catch (SQLException sqlex) {
			System.out.println("Error: " + sqlex.getMessage());
		}
	}

	/**
	 * Este método sirve para hacer consultas
	 * @param sentencia
	 * @return
	 */
	
	public ResultSet ejecutarConsulta(String sentencia) {
		ResultSet rsResultado = null;
		try {
			System.out.println("Ejecutandoooo: " + sentencia);
			PreparedStatement prepStatement = conexion.prepareStatement(sentencia);
			System.out.println("aaaaaaaaaaaaaaa");
			rsResultado = prepStatement.executeQuery();
		} catch (SQLException sqlex) {
			sqlex.printStackTrace();
			System.out.println("Error: " + sqlex.getMessage());
		}
		return rsResultado;
	}

	/**
	 * Aquí crearemos el método para que los clientes se inserten en la base de datos cuando se registren, con sus respectivos atributos
	 * @param insertarCliente
	 * @return
	 */
	public int insertarCliente(Clientes cliente) {
		int iRes=0;
		String sInsert ="insert into Cliente ( correo_cli, contra_cli, nom_cli, ape_cli, tele_cli ) values (?, ?, ?, ?, ?)";
		try {
			System.out.println("Ejecutando: " + sInsert);
			System.out.println("datos: " + cliente);
			PreparedStatement prepStatement =
					conexion.prepareStatement(sInsert);
			prepStatement.setString(1,cliente.getCorreo_cli());
			prepStatement.setString(2, cliente.getContra_cli()) ;
			prepStatement.setString(3,cliente.getNom_cli());
			prepStatement.setString(4,cliente.getApe_cli());
			prepStatement.setInt(5,Integer.parseInt(cliente.getTele_cli()));

			iRes = prepStatement.executeUpdate();
		} catch (SQLException sqlex) {
			System.out.println("Error :" + sqlex.getMessage());
			sqlex.printStackTrace();
		}
		return iRes;
	}
	
	
	/**
	 * Aquí crearemos el método para que se inserten las ventas del clientes, se inserten en la base de datos cuando realizen una compra, con sus respectivos datos
	 * Pero no hemos conseguido que los datos se inseten en la base de datos
	 * @param insertarVentas
	 * @return
	 */
	public int insertarVentas(ventasClientes ventaClientes) {
		
		int iRes=0;
		String sInsert ="insert into ventasClientes (  cod_compr, cod_prod, cod_repa, cod_cli, fecha_compra ) values (?, ?, ?, ?, ?)";
		try {
			System.out.println("Ejecutando: " + sInsert);
			System.out.println("datos: " + ventaClientes);
			PreparedStatement prepStatement =
					conexion.prepareStatement(sInsert);
			prepStatement.setInt(1,ventaClientes.getCod_compr());
			prepStatement.setInt(2, ventaClientes.getCod_prod()) ;
			prepStatement.setInt(3,ventaClientes.getCod_repa());
			prepStatement.setInt(4,ventaClientes.getCod_cli());
			prepStatement.setString(5,(ventaClientes.getFecha_compra()));

			iRes = prepStatement.executeUpdate();
		} catch (SQLException sqlex) {
			System.out.println("Error :" + sqlex.getMessage());
			sqlex.printStackTrace();
		}
		return iRes;
	}
	
	

	

	
	
	

 
}





