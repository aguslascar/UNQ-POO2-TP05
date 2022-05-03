package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestFacturas {
	
	Caja cajaTest;
	Producto arroz;
	Producto leche;
	FacturaServicio edesur;
	FacturaImpuesto afip;
	
	@BeforeEach
	public void setUp() {
		arroz = new Producto("arroz", 26.50, 4);
		leche = new ProductoCooperativo("leche", 15.70, 5);
		cajaTest = new Caja();
		edesur = new FacturaServicio(1200,5);
		afip = new FacturaImpuesto(1200);

	}
	@Test
	void testProductosYFacturas() {
		cajaTest.registrar(arroz);
		cajaTest.registrar(leche);
		cajaTest.pagarFactura(edesur);
		cajaTest.pagarFactura(afip);
		assertEquals(7240.63, cajaTest.precioAPagar(), 1);
	}

}
