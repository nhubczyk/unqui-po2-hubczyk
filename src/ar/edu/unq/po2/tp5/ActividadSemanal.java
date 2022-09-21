package ar.edu.unq.po2.tp5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Stream;

public class ActividadSemanal {
	private DíaDeLaSemana día;
	private Date horaDeInicio;
	private Double duración;
	private Deporte deporte;
	
	public ActividadSemanal(DíaDeLaSemana día, Date hora, Double duración, Deporte dep) {
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
	
	public Date getHoraDeInicio() {
		return horaDeInicio;
	}
	
	public void setHoraDeInicio(Date horaDeInicio) {
		this.horaDeInicio = horaDeInicio;
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
