package ar.edu.unq.po2.templateMethod;

public class Pasante extends Empleado {


	@Override
	protected int getExtra() {
		return 0;
	}

	@Override
	protected int getSueldoBasico() {
		return this.cantidadDeHoras * 40;
	}

	@Override
	protected int getImpuesto() {
		return (this.getSueldoBasico() * 13) / 100;
	}

}
