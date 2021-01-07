package otropaquete;

public class Moto  extends Vehiculo{
	
	public Moto(String marca, String patente,double cilindrada) {
		super(marca, patente);
		this.cilindrada=cilindrada;
	}

	private double cilindrada;

	public double getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(double cilindrada) {
		this.cilindrada = cilindrada;
	}
	
	

}
