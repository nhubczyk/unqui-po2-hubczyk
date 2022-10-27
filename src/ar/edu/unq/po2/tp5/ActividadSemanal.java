package ar.edu.unq.po2.tp5;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Optional;
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
		List<ActividadSemanal> lista = Arrays.asList(new ActividadSemanal(DíaDeLaSemana.MIERCOLES, LocalTime.now(), 10.5, Deporte.BASKET)); 
		Stream<ActividadSemanal> stream = lista.stream();
		return stream.filter(s -> esDeporteDeFutbol(s)).toList();
	}
	
	public Boolean esDeporteDeFutbol(ActividadSemanal actividad) {
		return (actividad.getDeporte() == Deporte.FUTBOL);
	}
	
	public List<ActividadSemanal> allActivityComplejidad(int complejidad) {
		List<ActividadSemanal> lista = new ArrayList<ActividadSemanal>();
		Stream<ActividadSemanal> stream = lista.stream();
		return stream.filter(s -> s.getDeporte().complejidad == complejidad).toList();
	}
	
	public Double horasTotalesDelMunicipio() {
		List<ActividadSemanal> lista = Arrays.asList(new ActividadSemanal(DíaDeLaSemana.LUNES, LocalTime.now(), 20.4, Deporte.FUTBOL));   
		return lista.stream().map(actividad -> actividad.duración).reduce(0.00, (acumulado, nuevo) -> acumulado + nuevo);
	}
	
	public Optional<ActividadSemanal> menorCostoDeUnaActividad(Deporte deporte) {
		List<ActividadSemanal> lista = Arrays.asList(new ActividadSemanal(DíaDeLaSemana.JUEVES, LocalTime.now(), 5.8 , Deporte.FUTBOL)); 
		Stream<ActividadSemanal> stream = lista.stream();
		return stream.min(Comparator.comparing((ActividadSemanal actividad) -> actividad.getDeporte() == deporte));
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
