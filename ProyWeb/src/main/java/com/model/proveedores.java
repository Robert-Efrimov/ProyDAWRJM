package com.model;

public class proveedores {

	private int cod_prov;
	private String cif_prov;
	private String nom_empr;
	private String dir_prov;
	public proveedores(int cod_prov, String cif_prov, String nom_empr, String dir_prov) {
		super();
		this.cod_prov = cod_prov;
		this.cif_prov = cif_prov;
		this.nom_empr = nom_empr;
		this.dir_prov = dir_prov;
	}
	public int getCod_prov() {
		return cod_prov;
	}
	public void setCod_prov(int cod_prov) {
		this.cod_prov = cod_prov;
	}
	public String getCif_prov() {
		return cif_prov;
	}
	public void setCif_prov(String cif_prov) {
		this.cif_prov = cif_prov;
	}
	public String getNom_empr() {
		return nom_empr;
	}
	public void setNom_empr(String nom_empr) {
		this.nom_empr = nom_empr;
	}
	public String getDir_prov() {
		return dir_prov;
	}
	public void setDir_prov(String dir_prov) {
		this.dir_prov = dir_prov;
	}
	
	
}
