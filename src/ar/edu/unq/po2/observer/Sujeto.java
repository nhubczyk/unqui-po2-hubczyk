package ar.edu.unq.po2.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Sujeto {
	List<Observador> observadores = new ArrayList<Observador>();
	
	public abstract void adscribir(Observador observador);
	
	public abstract void quitar(Observador observador);
	
	public abstract void notificar(Articulo articulo);
	
	public List<Observador> getObservadores() {
		return observadores;
	}
}
