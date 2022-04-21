package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCaja {
	
	Caja cajaTest;
	Producto arroz;
	Producto leche;
	
	@BeforeEach
	public void setUp() {
		arroz = new Producto("arroz", 26.50, 4);
		leche = new ProductoCooperativo("leche", 15.70, 5);
		cajaTest = new Caja();
	}
	
	@Test
	void testRegistrar() {
		cajaTest.registrar(arroz);
		cajaTest.registrar(leche);
		assertEquals(2, cajaTest.cantidadDeProductos());
	}
	
	@Test
	void testPrecioTotal() {
		cajaTest.registrar(arroz);
		assertEquals(26.50, cajaTest.precioAPagar());
		cajaTest.registrar(leche);
		assertEquals(40.63, cajaTest.precioAPagar(), 1);
	}

}
