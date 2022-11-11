package ar.edu.unq.po2.templateMethod;

public class Temporario extends Empleado {

	@Override
	protected int getSueldoBasico() {
		return 1000;
	}

	@Override
	protected int getExtra() {
		return this.extraPorCantidadDeHoras() + this.extraPorHijo();
	}

	private int extraPorHijo() {
		if(this.tieneHijos || this.estaCasado) {
			return 100;
		}
		else {
			return 0;
		}
	}

	private int extraPorCantidadDeHoras() {
		return this.cantidadDeHoras * 5;
	}

	@Override
	protected int getImpuesto() {
		return (this.getSueldoBasico() * 13) / 100;
	}


}