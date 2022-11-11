package ar.edu.unq.po2.templateMethod;

public class Planta extends Empleado {


	@Override
	protected int getExtra() {
		if(this.tieneHijos) {
			return this.cantidadDeHijos * 150;
		}
		return 0;
	}

	@Override
	protected int getSueldoBasico() {
		return 3000;
	}

	@Override
	protected int getImpuesto() {
		return (this.getSueldoBasico() * 13) / 100;
	}

}
