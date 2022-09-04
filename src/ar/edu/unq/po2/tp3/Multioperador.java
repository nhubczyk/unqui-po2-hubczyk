package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.List;

public class Multioperador {
	
	private List<Integer> numeros = new ArrayList<Integer>();
	
	public void addNumber(int i) {
		numeros.add(i);	
	}
	
	public int sumaDeEnteros() {
		var suma = 0;
		for (int i = 0; i < numeros.size(); i++) {
			suma = suma + numeros.get(i);
		}
		return suma;
	}
	
	public int restaDeEnteros() {
		var resta = 0;
		for (int i = 0; i < numeros.size(); i++) {
			 resta = numeros.get(i) - numeros.get(i);
		}
		return resta;
	}
	
	public int multiplicacionDeEnteros() {
		var multi = 1;
		for (int i = 0; i < numeros.size(); i++) {
			 multi = multi * numeros.get(i);
		}
		return multi;
	}
}
