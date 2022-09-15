package ar.edu.unq.po2.tp5;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
	private List<String> nombres = new ArrayList<String>();
	
	public void agregarNombre(String nom) {
		this.nombres.add(nom);
	}
	
	public Boolean anyMatch(String inicio) {
		for (String nombre : nombres) {
			if(nombre.startsWith(inicio)) {
				return true;
			}
		}
		return false;
	}
	
	public Boolean allMatch(String inicio) {
		for (String nombre : nombres) {
			if(nombre.startsWith(inicio)) {
				return false;
			}
		}
		return true;
	}
	
	public Boolean noneMatch(String inicio) {
		return !this.anyMatch(inicio);
	}
	
	public List<String> filter (String inicio) {
		List<String> res = new ArrayList<String>();
		for (String nom : nombres) {
			if(nom.startsWith(inicio)) {
				res.add(nom);
			}
		}
		return res;
	}
	
	public void printAll() {
		for (String nom : nombres) {
			System.out.println("Los elementos de la lista son:" + nom);
		}
	}
	

}
