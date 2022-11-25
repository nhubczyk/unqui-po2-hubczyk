package ar.edu.unq.po2.parcial.microbiologia;

public class Bacilos extends Bacteria {
	private double longitud;
	
	public Bacilos(double longitud, int ppm) {
		this.longitud=longitud;
		this.setPpm(ppm);
	}
	
	@Override
	public double consumoDeOxigeno() {
		if (this.getEdad() < 2) {
			return this.cantidadDePPMSPorLongitud();
		}
		else {
			return this.cantidadDePPMSPorLongitud() / this.getEdad();
		}
	}

	public double getLongitud() {
		return longitud;
	}
	
	public double cantidadDePPMSPorLongitud() {
		return this.getPpm() * this.getLongitud();
	}

}
