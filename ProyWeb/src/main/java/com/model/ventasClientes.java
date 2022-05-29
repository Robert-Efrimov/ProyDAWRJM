package com.model;

public class ventasClientes {

	private int cod_compr;
	private int cod_prod;
	private int cod_repa;
	private int cod_cli;
	private String fecha_compra;
	public ventasClientes(int cod_compr, int cod_prod, int cod_repa, int cod_cli, String fecha_compra) {
		super();
		this.cod_compr = cod_compr;
		this.cod_prod = cod_prod;
		this.cod_repa = cod_repa;
		this.cod_cli = cod_cli;
		this.fecha_compra = fecha_compra;
	}
	public int getCod_compr() {
		return cod_compr;
	}
	public void setCod_compr(int cod_compr) {
		this.cod_compr = cod_compr;
	}
	public int getCod_prod() {
		return cod_prod;
	}
	public void setCod_prod(int cod_prod) {
		this.cod_prod = cod_prod;
	}
	public int getCod_repa() {
		return cod_repa;
	}
	public void setCod_repa(int cod_repa) {
		this.cod_repa = cod_repa;
	}
	public int getCod_cli() {
		return cod_cli;
	}
	public void setCod_cli(int cod_cli) {
		this.cod_cli = cod_cli;
	}
	public String getFecha_compra() {
		return fecha_compra;
	}
	public void setFecha_compra(String fecha_compra) {
		this.fecha_compra = fecha_compra;
	}
	
	
}
