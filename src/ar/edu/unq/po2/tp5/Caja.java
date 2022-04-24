package ar.edu.unq.po2.tp5;

import java.util.ArrayList;
import java.util.List;

public class Caja {
	private List<Producto> productos = new ArrayList<Producto>();
	private double precioTotal = 0.0;
	
	public void registrar(Producto producto) {
		/**
		 * Registra un producto que el cliente va a comprar.
		 * Lo agrega a la lista de productos y lo suma al monto a pagar.
		 */
		this.precioTotal += producto.getPrecio();
		producto.restarStock();
		productos.add(producto);
	}
	
	public void pagarFactura(Factura factura) {
		/**
		 * Suma el monto de la factura al monto total a pagar.
		 * Notifica a la agencia recaudadora.
		 */
		precioTotal += factura.montoAPagar();
		factura.registrarPago();
	}
	
	public double precioAPagar() {
		return precioTotal;
	}
	
	public int cantidadDeProductos() {
		return productos.size();
	}
}
