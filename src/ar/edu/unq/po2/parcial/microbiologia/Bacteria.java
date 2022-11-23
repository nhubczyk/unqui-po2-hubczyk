package ar.edu.unq.po2.parcial.microbiologia;

public abstract class Bacteria {
	private int ppm;
	private int edad;
	
	public abstract double consumoDeOxigeno();
	public abstract int cantidadDePPMS();

	public int getPpm() {
		return ppm;
	}
	public int getEdad() {
		return edad;
	}
}
