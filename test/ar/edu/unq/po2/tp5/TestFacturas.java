package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestFacturas {
	
	Caja cajaTest;
	Producto arroz;
	Producto leche;
	Impuesto afip;
	Servicio edesur;
	
	@BeforeEach
	public void setUp() {
		arroz = new Producto("arroz", 26.50, 4);
		leche = new ProductoCooperativo("leche", 15.70, 5);
		cajaTest = new Caja();
		afip = new Impuesto();
		edesur = new Servicio();
	}
	@Test
	void testProductosYFacturas() {
		cajaTest.registrar(arroz);
		cajaTest.registrar(leche);
		cajaTest.pagarFactura(new FacturaServicio(edesur,1200,5));
		cajaTest.pagarFactura(new FacturaImpuesto(afip,1200));
		assertEquals(7240.63, cajaTest.precioAPagar(), 1);
	}

}
