package ar.edu.unq.po2.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class SujetoServidor {
	List<ObservadorListener> observadoresListeners = new ArrayList<ObservadorListener>();
	
	public abstract void adscribir(ObservadorListener observador);
	
	public abstract Boolean quitar(ObservadorListener observador);
	
	public abstract void notificar(Partido partido);
	
	public List<ObservadorListener> getObservadores() {
		return observadoresListeners;
	}
}
