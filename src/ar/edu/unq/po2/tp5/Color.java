package ar.edu.unq.po2.tp5;

public enum Color {
	ROJO("color rojo", 1), 
	GRIS("color gris", 2), 
	AMARILLO("color amarillo", 3), 
	MIEL("color miel", 4);
	
	String descripcion;
	int nivelDeRiesgo;
	
	Color(String desc, int i) {
		this.descripcion=desc;
		this.nivelDeRiesgo=i;
	}
	
	public String getDescripcion() {
		return this.descripcion;
	}
	
	public void setDescripcion(String desc) {
		this.descripcion=desc;
	}
	
	public int getNivelDeRiesgo() {
		return this.nivelDeRiesgo;
	}
	
	public void setNivelDeRiesgo(int nivel) {
		this.nivelDeRiesgo=nivel;
	}
	
	public int siguienteElemento(Color color) {
		return color.ordinal();
	}
}
