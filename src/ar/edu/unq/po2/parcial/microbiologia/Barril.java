package ar.edu.unq.po2.parcial.microbiologia;

public class Barril {
	private int añoDeFabricacion;
	private int codigo;
	private Consumidor miConsumidor;

	public Barril(int año, int codigo) {
		this.añoDeFabricacion=año;
		this.codigo=codigo;
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

	public int getCodigo() {
		return codigo;
	}
}
