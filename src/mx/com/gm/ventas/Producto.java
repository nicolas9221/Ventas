package mx.com.gm.ventas;

public class Producto {
	private final int  idProducto;
	private String nombre;
	private double precio;
	private static int contadorProcutos;
	
	private Producto()
	{
		this.idProducto = ++Producto.contadorProcutos;
	}
	
	 public Producto(String nombre, double precio)
	 {
		 this();
		 this.nombre = nombre;
		 this.precio = precio;
	 }

	public int getIdProducto() {
		return idProducto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public static int getContadorProcutos() {
		return contadorProcutos;
	}

	public static void setContadorProcutos(int contadorProcutos) {
		Producto.contadorProcutos = contadorProcutos;
	}

	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", precio=" + precio + "]";
	}
	 
	
	 
}
