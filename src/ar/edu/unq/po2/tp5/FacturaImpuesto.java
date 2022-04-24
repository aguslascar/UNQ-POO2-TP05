package ar.edu.unq.po2.tp5;

public class FacturaImpuesto implements Factura{

	private Agencia agencia;
	private int tasa;

	private void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}

	public FacturaImpuesto(Agencia agencia, int tasa) {
		this.setTasa(tasa);
		this.setAgencia(agencia);
	}

	public void setTasa(int tasa) {
		this.tasa = tasa;
	}
	
	public int montoAPagar() {
		return tasa;
	}
	
	public void registrarPago() {
		agencia.registrarPago(this);
	}
}
