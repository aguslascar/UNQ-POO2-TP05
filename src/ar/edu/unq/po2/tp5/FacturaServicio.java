package ar.edu.unq.po2.tp5;

public class FacturaServicio  implements Factura{
	
	private Agencia agencia;
	private int costoPorUnidad;
	private int cantUnidades;
	
	private void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}

	private void setCostoPorUnidad(int costoPorUnidad) {
		this.costoPorUnidad = costoPorUnidad;
	}

	private void setCantUnidades(int cantUnidades) {
		this.cantUnidades = cantUnidades;
	}

	public FacturaServicio(Agencia agencia, int costo, int cant) {
		this.setAgencia(agencia);
		this.setCostoPorUnidad(costo);
		this.setCantUnidades(cant);
	}
	
	public void registrarPago() {
		agencia.registrarPago(this);
	}

	@Override
	public int montoAPagar() {
		return costoPorUnidad * cantUnidades;
	}
	
}
