package ar.edu.unq.po2.parcial.secretarias;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Programa extends Actividad {
	private int costo;
	private List<Actividad> actividades = new ArrayList<Actividad>();
	
	public Programa(String nombre, Empleado lider, int costo ) {
		super(nombre, lider);
		this.costo=costo;
	}
	
	@Override
	public int inversionTotal() {
		return this.getCosto() + this.sumatoriaDeInversiones();
	}

	private int sumatoriaDeInversiones() {
		return 
			actividades.stream().mapToInt(actividad -> actividad.inversionTotal()).sum();
	}

	@Override
	public LocalDate getFechaDeInicio() {
		// actividades.get[0] me da la primer actividad y a eso le pido la fecha de inicio.
		var fechaMasAntigua = actividades.get(0).getFechaDeInicio();
		for(Actividad actividad :actividades) {
		// Si la actividad del bucle del for es menor a la mas antigua, la reemplaza.
			if (fechaMasAntigua.isAfter(actividad.getFechaDeInicio())) {
				fechaMasAntigua = actividad.getFechaDeInicio();
			}
		}
		return fechaMasAntigua;
	}
	
	public int getCosto() {
		return this.costo;
	}
	
	public void addActividad(Actividad actividad) {
		this.actividades.add(actividad);
	}
	
	public void removeActividad(Actividad actividad) {
		this.actividades.remove(actividad);
	}
	
	public List<Actividad> getActividades() {
		return this.actividades;
	}

}
