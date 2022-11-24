package ar.edu.unq.po2.parcial.microbiologia;

public class Barril {
	private int añoDeFabricacion;
	private Consumidor miConsumidor;

	public Barril(int año) {
		this.añoDeFabricacion=año;
	}
	
	public int getAñoDeFabricacion() {
		return añoDeFabricacion;
	}

	public Consumidor getMiConsumidor() {
		return miConsumidor;
	}
	
	public double getConsumoDeBacteriasYPoblacion() {
		return this.getMiConsumidor().consumoDeOxigeno();
	}
}
