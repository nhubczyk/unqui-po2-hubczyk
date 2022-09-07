package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.List;

public class EquipoDeTrabajo {
	private String nombre;
	private List<Persona> integrantes = new ArrayList<Persona>();
	
	public EquipoDeTrabajo(String nombreDelEquipo, Persona persona1, Persona persona2, Persona persona3, Persona persona4, Persona persona5) {
		nombre=nombreDelEquipo;
		integrantes.add(persona1);
		integrantes.add(persona2);
		integrantes.add(persona3);
		integrantes.add(persona4);
		integrantes.add(persona5);
	}
	
	public int promedioDeLosIntegrantes() {
		return this.edadDeLosIntegrantes() / integrantes.size();
	}
	
	public void imprimirPromedioDeEdad() {
		System.out.println("El promedio de edad de los integrantes es de" + this.promedioDeLosIntegrantes());
	}
	
	public int edadDeLosIntegrantes() {
		var total=0;
		for(int i = 0; i <= integrantes.size(); i++) {
			total=total + integrantes.get(i).getEdad();
		}
		return total;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
