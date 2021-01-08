package otropaquete;

import java.awt.List;
import java.util.Arrays;

import javax.print.attribute.standard.PrinterLocation;

public class Persona {
	private String nombre;
	private String apellido;
	private Vehiculo vehiculos[];
	private List vehiculosLista;
	
	public Persona(String roberto,String pepito)
	{
		this.nombre = roberto;
		this.apellido = pepito;
	}
	public void setNombre(String string) {
		this.nombre = string;		
	}

	public String getNombre() {
		return this.nombre;
	}
	
	public void setVehiculo(Vehiculo[] vehiculos) {
		this.vehiculos = vehiculos;
	}
	
	public void setVehiculoLista(Vehiculo vehiculos)
	{
		this.vehiculosLista.addItem(apellido);
	}
	
	public void mostrarVehiculos()
	{
		for (int i = 0; i < vehiculos.length; i++) {
			System.out.println("Vehiculo nro "+ i);
			System.out.println("La marca es:"+this.vehiculos[i].getMarca());
			System.out.println("La patente es :"+this.vehiculos[i].getPatente());
			
		}
	}
	
	public String muestroValores()
	{
		return "El nombre es: "+ this.nombre+ "\nEl apellido es: "+ this.apellido;
	}
	
	
	
}
