package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestProducto {
	
	
	Producto arroz;
	Producto leche;
	
	@BeforeEach
	public void setUp() {
		arroz = new Producto("arroz", 26.50, 4);
		leche = new ProductoCooperativo("leche", 15.70, 5);
	}
	
	@Test
	void testPrecioDeProductos() {
		assertEquals(26.50, arroz.getPrecio());
		assertEquals(14.13, leche.getPrecio(),1);
		//El 1 al final del assertEquals sirve para decirle al assert que cantidad de decimales mirar.
	}
	
	@Test 
	void testRestarStock() {
		//Envio el mensaje a leche de restarStock() que va a restar en una unidad el stock total
		leche.restarStock();
		assertEquals(4, leche.getStock());
		
	}

}
