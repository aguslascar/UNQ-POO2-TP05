package ar.edu.unq.po2.tp5;

public class ProductoCooperativo extends Producto {

	public ProductoCooperativo(String nombre, double precio, int cantidad) {
		super(nombre, precio, cantidad);
	}

	@Override 
	public double getPrecio() {
		/**
		 * Precio de producto de cooperativa. Al precio base del producto se le hace 
		 * un descuento del 10% en concepto de IVA.
		 */
		return super.getPrecio() * 0.90;
	}
	
}
