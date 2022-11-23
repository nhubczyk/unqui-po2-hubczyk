package ar.edu.unq.po2.observer;

import java.util.ArrayList;
import java.util.List;

public class Articulo {
	private String titulo;
	private List<Autor> autores = new ArrayList<Autor>();
	private List<Filiacion> filiaciones = new ArrayList<Filiacion>();
	private String tipoDeArticulo;
	private String lugarDePublicacion;
	private List<PalabraClave> palabrasClaves = new ArrayList<PalabraClave>();
	
	public String getTitulo() {
		return titulo;
	}
	public List<Autor> getAutores() {
		return autores;
	}
	public List<Filiacion> getFiliaciones() {
		return filiaciones;
	}
	public String getTipoDeArticulo() {
		return tipoDeArticulo;
	}
	public String getLugarDePublicacion() {
		return lugarDePublicacion;
	}
	public List<PalabraClave> getPalabrasClaves() {
		return palabrasClaves;
	}
	
	
}
