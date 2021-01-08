package mx.com.gm.ventas.test;

import mx.com.gm.ventas.Orden;
import mx.com.gm.ventas.Producto;

public class VentasTest {	
	public static void main(String Args[]) {
			Producto producto1 = new Producto("Remolacha",10);
			Producto producto2=  new Producto("Pollo",200);
			Producto producto3 = new Producto("Panceta",654);
				
		Orden nuevaOrden = new Orden();
		
		nuevaOrden.agregarProducto(producto1);
		nuevaOrden.agregarProducto(producto2);
		nuevaOrden.agregarProducto(producto3);
		
		nuevaOrden.mostrarOrden();
		
		
	}
}
