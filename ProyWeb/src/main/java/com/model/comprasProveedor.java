package com.model;

public class comprasProveedor {

	private int cod_venta;
	private int cod_prov;
	private int cod_prod;
	private String fecha_venta;
	private int cant_prod;
	private String ciudad_cli_venta;
	private String dir_cli_venta ;
	public comprasProveedor(int cod_venta, int cod_prov, int cod_prod, String fecha_venta, int cant_prod,
			String ciudad_cli_venta, String dir_cli_venta) {
		super();
		this.cod_venta = cod_venta;
		this.cod_prov = cod_prov;
		this.cod_prod = cod_prod;
		this.fecha_venta = fecha_venta;
		this.cant_prod = cant_prod;
		this.ciudad_cli_venta = ciudad_cli_venta;
		this.dir_cli_venta = dir_cli_venta;
	}
	public int getCod_venta() {
		return cod_venta;
	}
	public void setCod_venta(int cod_venta) {
		this.cod_venta = cod_venta;
	}
	public int getCod_prov() {
		return cod_prov;
	}
	public void setCod_prov(int cod_prov) {
		this.cod_prov = cod_prov;
	}
	public int getCod_prod() {
		return cod_prod;
	}
	public void setCod_prod(int cod_prod) {
		this.cod_prod = cod_prod;
	}
	public String getFecha_venta() {
		return fecha_venta;
	}
	public void setFecha_venta(String fecha_venta) {
		this.fecha_venta = fecha_venta;
	}
	public int getCant_prod() {
		return cant_prod;
	}
	public void setCant_prod(int cant_prod) {
		this.cant_prod = cant_prod;
	}
	public String getCiudad_cli_venta() {
		return ciudad_cli_venta;
	}
	public void setCiudad_cli_venta(String ciudad_cli_venta) {
		this.ciudad_cli_venta = ciudad_cli_venta;
	}
	public String getDir_cli_venta() {
		return dir_cli_venta;
	}
	public void setDir_cli_venta(String dir_cli_venta) {
		this.dir_cli_venta = dir_cli_venta;
	}
	
	
}
