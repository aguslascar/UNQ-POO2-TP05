package ar.edu.unq.po2.tp5;

public class Producto {
	
	private String nombre;
	private double precio = 0.0;
	private int stock = 0;
	
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

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public Producto(String nombre, double precio, int cantidad) {
		this.setNombre(nombre);
		this.setPrecio(precio);
		this.setStock(cantidad);
	}
	
	public void restarStock() {
		/** 
		 * Se resta una unidad del stock total del producto.
		 */
		this.setStock(this.getStock() - 1);
	}
	
	
}
