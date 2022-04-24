package ar.edu.unq.po2.tp5;

import java.util.ArrayList;
import java.util.List;

public class Impuesto implements Agencia{
	
	private List<Factura> facturasPagas = new ArrayList<Factura>();

	@Override
	public void registrarPago(Factura factura) {
		/**
		 * Agrega la factura a la lista de facturas pagas
		 */
		facturasPagas.add(factura);
	}
}
