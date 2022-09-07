package ar.edu.unq.po2.tp3;

import java.time.LocalDate;
import java.time.Period;

public class Persona {
	private String nombre;
	private LocalDate fechaDeNacimiento;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public LocalDate getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}
	public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	
	public int edadDeLaPersona() {
		LocalDate fechaActual = LocalDate.now();
		Period periodo = Period.between(getFechaDeNacimiento(), fechaActual);
		return periodo.getYears();
	}
	
	public boolean menorQue(Persona persona) {
		if (edadDeLaPersona() < persona.edadDeLaPersona()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public Persona (String nombre, LocalDate fechaNacimiento) {
		Persona persona;
		persona = new Persona(nombre, fechaNacimiento);
		return persona;
	}
	
}
