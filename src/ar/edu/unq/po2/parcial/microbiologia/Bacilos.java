package ar.edu.unq.po2.parcial.microbiologia;

public class Bacilos extends Bacteria {
	private double longitud;
	
	@Override
	public double consumoDeOxigeno() {
		if (this.getEdad() < 2) {
			return this.cantidadDePPMSPorLongitud();
		}
		else {
			return this.cantidadDePPMSPorLongitud() / this.getEdad();
		}
	}

	@Override
	public int cantidadDePPMS() {
		return this.getPpm() * 3;
	}

	public double getLongitud() {
		return longitud;
	}
	
	public double cantidadDePPMSPorLongitud() {
		return this.cantidadDePPMS() * this.getLongitud();
	}

}
