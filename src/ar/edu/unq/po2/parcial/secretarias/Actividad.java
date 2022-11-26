package ar.edu.unq.po2.parcial.secretarias;

import java.time.LocalDate;

public abstract class Actividad {
	private String nombre;
	private Empleado lider;
	
	public abstract int inversionTotal();
	
	public abstract LocalDate getFechaDeInicio();

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Actividad(String nombre, Empleado lider) {
		this.nombre=nombre;
		this.lider=lider;
	}

	public Empleado getLider() {
		return lider;
	}
}
