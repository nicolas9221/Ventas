package otropaquete;

public abstract class Vehiculo {
	private String marca;
	private String patente;
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getPatente() {
		return patente;
	}
	public void setPatente(String patente) {
		this.patente = patente;
	}
	public Vehiculo(String marca, String patente) {
		super();
		this.marca = marca;
		this.patente = patente;
	}
	
	
}
