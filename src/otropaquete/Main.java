package otropaquete;

import java.awt.List;

public class Main {

	public static void main(String[] args) {

		Persona pepe = new Persona("Pepe", "Ramirez");

		Moto m = new Moto("honda", "JIQ888", 600);
		Moto h = new Moto("Yamaha ", "AHB999", 600);
		Auto a = new Auto("Audi","DBC219",2);

		Vehiculo[] vehiculosPepe = new Vehiculo[3];

		vehiculosPepe[0] = m;
		vehiculosPepe[1] = h;
		vehiculosPepe[2] = a;
		
		pepe.setVehiculo(vehiculosPepe);
		
		System.out.println(pepe.muestroValores());
		
		pepe.mostrarVehiculos();
		
		
	}
	
	

}
