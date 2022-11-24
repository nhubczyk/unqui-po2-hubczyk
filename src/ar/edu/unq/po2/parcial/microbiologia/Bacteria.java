package ar.edu.unq.po2.parcial.microbiologia;

public abstract class Bacteria extends Consumidor {
	private int ppm;
	private int edad;
	
	public abstract double consumoDeOxigeno();
	public abstract int cantidadDePPMS();

	public int getPpm() {
		return ppm;
	}
	
	protected void setPpm(int ppm) {
		this.ppm=ppm;
	}
	
	public int getEdad() {
		return edad;
	}
	
	
}
