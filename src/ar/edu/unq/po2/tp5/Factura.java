package ar.edu.unq.po2.tp5;

public class Factura implements Agencia {
	private int costoPorUnidad;
	private int cantidadDeUnidades;
	
	public Factura(int costo, int cant) {
		this.setCostoPorUnidad(costo);
		this.setCantidadDeUnidades(cant);
	}
	
	@Override
	public int montoAPagar() {
		return this.getCantidadDeUnidades() * this.getCostoPorUnidad();
	}
	
	public int getCostoPorUnidad() {
		return costoPorUnidad;
	}
	
	public void setCostoPorUnidad(int costoPorUnidad) {
		this.costoPorUnidad = costoPorUnidad;
	}
	
	public int getCantidadDeUnidades() {
		return cantidadDeUnidades;
	}
	
	public void setCantidadDeUnidades(int cantidadDeUnidades) {
		this.cantidadDeUnidades = cantidadDeUnidades;
	}
	
	@Override
	public void registrarPago(Factura factura) {
		System.out.println("El pago es:" + factura.montoAPagar());
	}
}
