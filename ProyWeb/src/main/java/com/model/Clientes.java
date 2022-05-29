package com.model;

public class Clientes {

	private String cod_cli;
	private String correo_cli;
	private String contra_cli;
	private String nom_cli;
	private String ape_cli;
	private String tele_cli;
	
	
	
	
	public Clientes(String cod_cli, String correo_cli, String contra_cli, String nom_cli, String ape_cli,
			String tele_cli) {
		super();
		this.cod_cli = cod_cli;
		this.correo_cli = correo_cli;
		this.contra_cli = contra_cli;
		this.nom_cli = nom_cli;
		this.ape_cli = ape_cli;
		this.tele_cli = tele_cli;
		
	}
	public String getCod_cli() {
		return cod_cli;
	}
	public void setCod_cli(String cod_cli) {
		this.cod_cli = cod_cli;
	}
	public String getCorreo_cli() {
		return correo_cli;
	}
	public void setCorreo_cli(String correo_cli) {
		this.correo_cli = correo_cli;
	}
	public String getContra_cli() {
		return contra_cli;
	}
	public void setContra_cli(String contra_cli) {
		this.contra_cli = contra_cli;
	}
	public String getNom_cli() {
		return nom_cli;
	}
	public void setNom_cli(String nom_cli) {
		this.nom_cli = nom_cli;
	}
	public String getApe_cli() {
		return ape_cli;
	}
	public void setApe_cli(String ape_cli) {
		this.ape_cli = ape_cli;
	}
	public String getTele_cli() {
		return tele_cli;
	}
	public void setTele_cli(String tele_cli) {
		this.tele_cli = tele_cli;
	}
	
	
	
	
}
