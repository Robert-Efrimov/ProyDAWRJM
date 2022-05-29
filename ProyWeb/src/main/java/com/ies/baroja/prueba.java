package com.ies.baroja;

import java.util.LinkedList;

import com.model.productos;
/**
 * clase creada para hacer pruebas
 *
 */
public class prueba {

	public static void main(String[] args) {
		LinkedList<productos> listaProductos = new LinkedList<productos>();
		listaProductos = Controller.getImagenes("PC");
		
		for (int i=0; i<listaProductos.size(); i++) {
		String imagen = listaProductos.get(i).getImagenes();
		System.out.println(imagen);
		}
		

	}

}
