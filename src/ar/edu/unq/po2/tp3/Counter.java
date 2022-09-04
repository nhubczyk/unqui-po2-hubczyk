package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.List;

public class Counter {
	
	private List<Integer> numeros = new ArrayList<Integer>();
	
	public int contarNumerosPares() {
		var pares = 0;
		for (int i = 0; i < numeros.size(); i++ ) {
			if (numeros.get(i) % 2 == 0) {
				pares ++;
			}
		}
		return pares;
	}
	
	public int contarNumerosImpares() {
		var impares = 0;
		for (int i= 0; i < numeros.size(); i++ ) {
			if (numeros.get(i) % 2 != 0) {
				impares ++;
			}
		}
		return impares;
	}
	
	/*Asi es como se declara una funcion en Java*/
	static void multiplos(int x, int y) {
		
	}

	public void addNumber(int i) {
		numeros.add(i);	
	}

}
