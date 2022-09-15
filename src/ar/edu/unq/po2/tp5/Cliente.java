package ar.edu.unq.po2.tp5;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	private List<Registro> registros = new ArrayList<Registro>();
	
	public void agregarRegistro(Registro r) {
		registros.add(r);
	}
	
	public Cliente(Registro r) {
		this.agregarRegistro(r);
	}
}
