package com.model;

public class Jugadores {

	private String Nombre;
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		this.Nombre = nombre;
	}
	public String getProcedencia() {
		return Procedencia;
	}
	public void setProcedencia(String procedencia) {
		this.Procedencia = procedencia;
	}
	public String getAltura() {
		return Altura;
	}
	public void setAltura(String altura) {
		this.Altura = altura;
	}
	public String getPeso() {
		return Peso;
	}
	public void setPeso(String peso) {
		this.Peso = peso;
	}
	public String getPosicion() {
		return Posicion;
	}
	public void setPosicion(String posicion) {
		this.Posicion = posicion;
	}
	public String getNombre_equipo() {
		return Nombre_equipo;
	}
	public void setNombre_equipo(String nombre_equipo) {
		this.Nombre_equipo = nombre_equipo;
	}
	private String Procedencia;
	private String Altura;
	private String Peso;
	private String Posicion;
	private String Nombre_equipo;
	public Jugadores(String nombre, String procedencia, String altura, String peso, String posicion,
			String nombre_equipo) {
		super();
		this.Nombre = nombre;
		this.Procedencia = procedencia;
		this.Altura = altura;
		this.Peso = peso;
		this.Posicion = posicion;
		this.Nombre_equipo = nombre_equipo;
	}
	
	
	
	
}
