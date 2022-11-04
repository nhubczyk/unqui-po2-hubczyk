package ar.edu.unq.po2.observer;

import java.util.ArrayList;
import java.util.List;

public class AplicacionMovil {
	private List<Partido> partidos = new ArrayList<Partido>();
	
	public void guardarResultados(Partido partido) {
		this.partidos.add(partido);
	}
	
	public Boolean contiene(Partido partido) {
		return this.partidos.contains(partido);
	}
}
