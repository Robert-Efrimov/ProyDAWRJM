package com.model;

public class productos {
	private int cod_prod;
	private String nom_prod;
	private String nom_cons;
	private String genero_prod;
	private int precio_prod;
	private String descripcion;
	private String imagenes;
	public productos(int cod_prod, String nom_prod, String nom_cons, String genero_prod, int precio_prod,
			String descripcion, String imagenes) {
		super();
		this.cod_prod = cod_prod;
		this.nom_prod = nom_prod;
		this.nom_cons = nom_cons;
		this.genero_prod = genero_prod;
		this.precio_prod = precio_prod;
		this.descripcion = descripcion;
		this.imagenes = imagenes;
	}
	public int getCod_prod() {
		return cod_prod;
	}
	public void setCod_prod(int cod_prod) {
		this.cod_prod = cod_prod;
	}
	public String getNom_prod() {
		return nom_prod;
	}
	public void setNom_prod(String nom_prod) {
		this.nom_prod = nom_prod;
	}
	public String getNom_cons() {
		return nom_cons;
	}
	public void setNom_cons(String nom_cons) {
		this.nom_cons = nom_cons;
	}
	public String getGenero_prod() {
		return genero_prod;
	}
	public void setGenero_prod(String genero_prod) {
		this.genero_prod = genero_prod;
	}
	public int getPrecio_prod() {
		return precio_prod;
	}
	public void setPrecio_prod(int precio_prod) {
		this.precio_prod = precio_prod;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getImagenes() {
		return imagenes;
	}
	public void setImagenes(String imagenes) {
		this.imagenes = imagenes;
	}
	
	
}
