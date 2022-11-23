package ar.edu.unq.po2.observer;

import java.util.ArrayList;
import java.util.List;

public class Partido {
	private String resultado;
	private List<Contrincante> contrincantes = new ArrayList<Contrincante>();
	private Deporte deporte;
	
	public Deporte getDeporte() {
		return deporte;
	}

	public List<Contrincante> getContrincantes() {
		return this.contrincantes;
	}

	public String getResultado() {
		return resultado;
	}

}
