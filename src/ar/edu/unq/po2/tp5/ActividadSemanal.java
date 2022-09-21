package ar.edu.unq.po2.tp5;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class ActividadSemanal {
	private DíaDeLaSemana día;
	private LocalTime horaDeInicio;
	private Double duración;
	private Deporte deporte;
	
	public ActividadSemanal(DíaDeLaSemana día, LocalTime hora, Double duración, Deporte dep) {
		this.setDía(día);
		this.setHoraDeInicio(hora);
		this.setDuración(duración);
		this.setDeporte(dep);
	}
	
	public List<ActividadSemanal> allActivictyFutbol() {
		List<ActividadSemanal> lista = new ArrayList<ActividadSemanal>();
		Stream<ActividadSemanal> stream = lista.stream();
		return stream.allMatch(s -> s.equals(deporte.FUTBOL));
	}
	
	public List<ActividadSemanal> allActivity(ActividadSemanal actividad) {
		
	}
	
	public int horasTotalesDelMunicipio() {
		List<ActividadSemanal> lista = new ArrayList<ActividadSemanal>();
		return int resultado = lista.stream().reduce(0,(total, nuevo) -> acumulado + nuevo);
	}
	
	public ActividadSemanal menorCostoDeUnaActividad(Deporte deporte) {
		List<ActividadSemanal> lista = new ArrayList<ActividadSemanal>();
	    return lista.stream().min(Comparator.comparing(Deporte.valueOf(deporte)::deporte));
	}
	
	public Map<Actividad, ActividadSemanal> actividadMásEconómica() {
		
	}
	
	public void allActivity() {
		
	}
	
	public int costo() {
		if((día == DíaDeLaSemana.LUNES) || día == DíaDeLaSemana.MARTES || día == DíaDeLaSemana.MIERCOLES) {
			return 500;
		}
		else {
			if((día == DíaDeLaSemana.JUEVES) || día == DíaDeLaSemana.VIERNES || día == DíaDeLaSemana.SABADO || día == DíaDeLaSemana.DOMINGO) {
				return 1000;
			}
		}
	}
	
	public DíaDeLaSemana getDía() {
		return día;
	}
	
	public void setDía(DíaDeLaSemana día) {
		this.día = día;
	}
	
	public LocalTime getHoraDeInicio() {
		return horaDeInicio;
	}
	
	public void setHoraDeInicio(LocalTime hora) {
		this.horaDeInicio = hora;
	}

	public Double getDuración() {
		return duración;
	}

	public void setDuración(Double duración) {
		this.duración = duración;
	}

	public Deporte getDeporte() {
		return deporte;
	}

	public void setDeporte(Deporte deporte) {
		this.deporte = deporte;
	}
}
