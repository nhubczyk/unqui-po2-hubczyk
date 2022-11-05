package ar.edu.unq.po2.templateMethod;

public abstract class Empleado {
	protected int cantidadDeHoras;
	protected boolean tieneHijos;
	protected boolean estaCasado;
	protected int cantidadDeHijos;
	
	final float sueldo() {
		return this.getSueldoBasico() + this.getExtra() - this.getImpuesto();
	}

	protected abstract int getImpuesto();

	protected abstract int getExtra();

	protected abstract int getSueldoBasico();
}
