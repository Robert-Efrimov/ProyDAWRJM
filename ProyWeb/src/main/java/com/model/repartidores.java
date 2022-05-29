package com.model;

public class repartidores {

	private int cod_repa;
	private String nom_repa;
	private String ape_repa;
	private String dir_repa;
	public repartidores(int cod_repa, String nom_repa, String ape_repa, String dir_repa) {
		super();
		this.cod_repa = cod_repa;
		this.nom_repa = nom_repa;
		this.ape_repa = ape_repa;
		this.dir_repa = dir_repa;
	}
	public int getCod_repa() {
		return cod_repa;
	}
	public void setCod_repa(int cod_repa) {
		this.cod_repa = cod_repa;
	}
	public String getNom_repa() {
		return nom_repa;
	}
	public void setNom_repa(String nom_repa) {
		this.nom_repa = nom_repa;
	}
	public String getApe_repa() {
		return ape_repa;
	}
	public void setApe_repa(String ape_repa) {
		this.ape_repa = ape_repa;
	}
	public String getDir_repa() {
		return dir_repa;
	}
	public void setDir_repa(String dir_repa) {
		this.dir_repa = dir_repa;
	}
	
	
	
}
