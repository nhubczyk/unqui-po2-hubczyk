package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.List;

public class Counter {
	
	private List<Integer> numeros = new ArrayList<Integer>();
	
	public int contarNumerosPares() {
		var contador = 0;
		for (int i=0; i <= numeros.size(); i++ ) {
			if (i / 2 == 0) {
				contador ++;
			}
		}
		return contador;
	}
	
	public int contarNumerosImpares() {
		var contador = 0;
		for (int i=0; i <= numeros.size(); i++ ) {
			if (i / 2 != 0) {
				contador ++;
			}
		}
		return contador;
	}

	public void addNumber(int i) {
		numeros.add(i);	
	}

}
