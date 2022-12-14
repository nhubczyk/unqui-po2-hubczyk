package ar.edu.unq.po2.tp4;

import java.util.ArrayList;
import java.util.List;

public class Supermercado {
	private String nombre;
	private String dirección;
	private List<Producto> productos = new ArrayList<Producto>();
	
	public Supermercado(Producto p, String nomDelSuper, String dirDelSuper) {
		this.agregarProducto(p);
		this.setNombre(nomDelSuper);
		this.setDirección(dirDelSuper);
	}
	
	public Supermercado(String nomDelSuper, String dirDelSuper) {
		this.setNombre(nomDelSuper);
		this.setDirección(dirDelSuper);
	}
	
	public void agregarProducto(Producto prod) {
		productos.add(prod);
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getDirección() {
		return this.dirección;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setDirección(String dirección) {
		this.dirección = dirección;
	}
	
	public int getCantidadDeProductos() {
		return productos.size();
	}
	
	public Double getPrecioTotal() {
		var suma = 0.00;
		for(int i = 0; i < this.getCantidadDeProductos(); i++) {
			suma = suma + productos.get(i).getPrecio();
		}
		return suma;
	}
}