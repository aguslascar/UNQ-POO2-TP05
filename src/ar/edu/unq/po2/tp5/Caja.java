package ar.edu.unq.po2.tp5;

import java.util.ArrayList;
import java.util.List;

public class Caja {
	private List<Producto> productos = new ArrayList<Producto>();
	private double precioTotal = 0.0;
	
	public void registrar(Producto producto) {
		this.precioTotal += producto.getPrecio();
		producto.restarStock();
		productos.add(producto);
	}
	
	public double precioAPagar() {
		return precioTotal;
	}
	
	public int cantidadDeProductos() {
		return productos.size();
	}
}
