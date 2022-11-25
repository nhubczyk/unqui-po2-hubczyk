package ar.edu.unq.po2.parcial.microbiologia;

public class Cocos extends Bacteria {
	private double radio;
	
	public Cocos(double radio, int ppm) {
		this.setPpm(ppm);
		this.radio=radio;
	}
	
	@Override
	public double consumoDeOxigeno() {
		return this.getPpm() * this.getRadio();
	}

	public double getRadio() {
		return radio;
	}

}
