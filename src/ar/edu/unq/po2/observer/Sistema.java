package ar.edu.unq.po2.observer;

import java.util.ArrayList;
import java.util.List;


public class Sistema extends Sujeto {
	private List<Articulo> articulos = new ArrayList<Articulo>();
	
	public Sistema() {
		
	}

	@Override
	public void adscribir(Observador observador) {
		this.observadores.add(observador);
	}

	@Override
	public void quitar(Observador observador) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void notificar(Articulo articulo) {
		for(Observador observador :observadores) {
			observador.actualizar(articulo);
		}	
	}

	public void cargarArticulo(Articulo articulo) {
		this.articulos.add(articulo);
		this.notificar(articulo);
		
	}

	public List<Articulo> getArticulos() {
		return articulos;
	}
	

}
