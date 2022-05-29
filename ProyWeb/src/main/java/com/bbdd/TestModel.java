package com.bbdd;

import java.util.LinkedList;

import com.ies.baroja.Controller;
import com.model.Clientes;
import com.model.Jugadores;


public class TestModel {

	public static void main(String[] args) {
		
		System.out.println("Inicio TestModel");
		LinkedList<Clientes> listaclientes = Controller.getClientes();

	}

}
