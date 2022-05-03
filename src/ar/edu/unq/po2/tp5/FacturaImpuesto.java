package ar.edu.unq.po2.tp5;

public class FacturaImpuesto implements Factura{

	private int tasa;


	public FacturaImpuesto(int tasa) {
		this.setTasa(tasa);
	}

	public void setTasa(int tasa) {
		this.tasa = tasa;
	}
	
	public int montoAPagar() {
		return tasa;
	}

}
