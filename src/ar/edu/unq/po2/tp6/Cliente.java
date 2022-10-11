package ar.edu.unq.po2.tp6;

public class Cliente {
	private String nombre;
	private String apellido;
	private String dirección;
	private int edad;
	private Float sueldoNetoMensual;
	private Float sueldoNetoAnual;
	private Banco banco;
	
	public Cliente(String nom, String apellido, String dir, int edad, Float sueldoNeto, Float sueldoAnual) {
		this.nombre=nom;
		this.apellido=apellido;
		this.dirección=dir;
		this.edad=edad;
		this.sueldoNetoMensual=sueldoNeto;
		this.setSueldoNetoAnual(sueldoAnual);
	}
	
	public void solicitarCredito() {
		
	}

	public Float getSueldoNetoAnual() {
		return sueldoNetoAnual;
	}

	public void setSueldoNetoAnual(Float sueldoNetoAnual) {
		this.sueldoNetoAnual = sueldoNetoAnual;
	}
}
