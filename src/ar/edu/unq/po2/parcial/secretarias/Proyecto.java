package ar.edu.unq.po2.parcial.secretarias;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Proyecto extends Actividad {
	private int duracion;
	private LocalDate fechaDeInicio;
	private List<Empleado> empleados = new ArrayList<Empleado>();
	
	public Proyecto(String nombre, LocalDate fecha, Empleado lider, int duracion) {
		super(nombre, lider);
		this.duracion=duracion;
		this.fechaDeInicio=fecha;
	}

	@Override
	public int inversionTotal() {
		return this.sumatoriaDelSueldoDiario() * this.getDuracion();
	}

	private int sumatoriaDelSueldoDiario() {
		return empleados.stream().mapToInt(empleado -> empleado.sueldoDiario()).sum() 
				+ this.getLider().sueldoDiario();
	}

	@Override
	public LocalDate getFechaDeInicio() {
		return this.fechaDeInicio;
	}
	
	public int getDuracion() {
		return this.duracion;
	}

}
