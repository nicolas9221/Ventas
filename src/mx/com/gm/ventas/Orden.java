package mx.com.gm.ventas;

import java.util.Iterator;

public class Orden {
	private int IdOrden;
	private Producto productos[];
	private static int contadorOrdenes;
	private int contadorProductos;
	private static final int maxProductos = 10;
	
	public Orden()
	{
		this.IdOrden = ++Orden.contadorOrdenes;
		this.productos = new Producto[Orden.maxProductos];
	}
	
	public void agregarProducto(Producto producto) {
		if(this.contadorProductos<Orden.maxProductos)
		{
			this.productos[this.contadorProductos++] = producto;
		}
		else {
			System.out.println("Se ha superado el maximo de productos por orden"+Orden.maxProductos);
		}
	}
	
	public double calcularTotal() {
		 double total = 0;
		
		for (int i = 0; i < this.contadorProductos; i++) {
			
			total += this.productos[i].getPrecio();			
		}
		return total;
		
		
	}
	public void mostrarOrden()
	{
		System.out.println("Orden nro:"+ this.IdOrden);
		
		
	}


	
}
