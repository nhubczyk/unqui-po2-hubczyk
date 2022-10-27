package ar.edu.unq.po2.observer;

import java.util.ArrayList;
import java.util.List;

public class Investigador extends Observador {
	private List<Articulo> articulos = new ArrayList<Articulo>();
	
	public void actualizar(Articulo articulo) {
		this.articulos.add(articulo);
	}

}
