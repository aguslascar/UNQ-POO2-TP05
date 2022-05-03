package ar.edu.unq.po2.tp5;

public class FacturaServicio  implements Factura{
	
	private int costoPorUnidad;
	private int cantUnidades;


	private void setCostoPorUnidad(int costoPorUnidad) {
		this.costoPorUnidad = costoPorUnidad;
	}

	private void setCantUnidades(int cantUnidades) {
		this.cantUnidades = cantUnidades;
	}

	public FacturaServicio(int costo, int cant) {
		this.setCostoPorUnidad(costo);
		this.setCantUnidades(cant);
	}
	

	@Override
	public int montoAPagar() {
		return costoPorUnidad * cantUnidades;
	}
	
}
