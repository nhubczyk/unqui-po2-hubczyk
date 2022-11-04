package ar.edu.unq.po2.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Listener extends ObservadorListener{
	private AplicacionMovil aplicacion;
	private List<Contrincante> contrincantes = new ArrayList<Contrincante>();
	private List<Deporte> deportes = new ArrayList<Deporte>();
	
	@Override
	public void actualizar(Partido partido) {
		if(this.coincideContrincante(this.contrincantes, partido.getContrincantes()) || deportes.contains(partido.getDeporte())) {
			aplicacion.guardarResultados(partido);
		}
	}

	private boolean coincideContrincante(List<Contrincante> contrincantes, List<Contrincante> contrincantesDePartido) {
		 Set<Contrincante> result = contrincantes.stream()
				  .distinct()
				  .filter(contrincantesDePartido::contains)
				  .collect(Collectors.toSet()); // Calcula la interseccion
		 return !result.isEmpty();
	}

}
