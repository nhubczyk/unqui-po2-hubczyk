package ar.edu.unq.po2.observer;

import java.util.ArrayList;
import java.util.List;

public class Servidor extends SujetoServidor {
	private List<Partido> partidos = new ArrayList<Partido>();
	
	@Override
	public void adscribir(ObservadorListener observador) {
		this.observadoresListeners.add(observador);
	}

	@Override
	public Boolean quitar(ObservadorListener observador) {
		return this.observadoresListeners.remove(observador);
	}

	@Override
	public void notificar(Partido partido) {
		for(ObservadorListener observador :observadoresListeners) {
			observador.actualizar(partido);
		}
	}
	
	public void cargarPartido(Partido partido) {
		this.partidos.add(partido);
		this.notificar(partido);
	}
	
	public List<Partido> getPartidos() {
		return partidos;
	}
	
	

}
