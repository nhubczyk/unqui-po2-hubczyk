package ar.edu.unq.po2.parcial.secretarias;

import java.util.ArrayList;
import java.util.List;

public class SecretariaDeInfraestructura {
	private List<Actividad> actividades = new ArrayList<Actividad>();
	
	public SecretariaDeInfraestructura() {
		
	}

	public List<Actividad> getActividades() {
		return actividades;
	}
	
	public int inversionTotal() {
		return 
			actividades.stream().mapToInt(actividad -> actividad.inversionTotal()).sum();
	}
}
