package ar.edu.unq.po2.templateMethod;

public class Temporario extends Empleado {

	@Override
	protected int getSueldoBasico() {
		return 1000;
	}

	@Override
	protected int getExtra() {
		if(this.tieneHijos || this.estaCasado) {
			return 100;
		}
		return this.cantidadDeHoras * 5;
	}

	@Override
	protected int getImpuesto() {
		return 13 / 100;
	}


}