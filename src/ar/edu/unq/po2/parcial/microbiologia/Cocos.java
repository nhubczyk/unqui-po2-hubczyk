package ar.edu.unq.po2.parcial.microbiologia;

public class Cocos extends Bacteria {
	private double radio;
	
	public Cocos(double radio, int ppm) {
		this.setPpm(ppm);
		this.radio=radio;
	}
	
	@Override
	public double consumoDeOxigeno() {
		return this.cantidadDePPMS() * this.getRadio();
	}

	public double getRadio() {
		return radio;
	}

	@Override
	public int cantidadDePPMS() {
		return this.getPpm() * 2;
	}

}
