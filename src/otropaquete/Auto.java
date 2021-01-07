package otropaquete;

public class Auto extends Vehiculo{
	
	private int cantPuertas;
	
	public Auto(String marca, String patente,int cantPuertas) {
		super(marca, patente);
		this.cantPuertas = cantPuertas;
	}

	public int getCantPuertas() {
		return cantPuertas;
	}

	public void setCantPuertas(int cantPuertas) {
		this.cantPuertas = cantPuertas;
	}
	
}
