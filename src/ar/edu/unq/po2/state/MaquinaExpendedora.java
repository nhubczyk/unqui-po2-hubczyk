package ar.edu.unq.po2.state;

import java.util.HashMap;
import java.util.Map;

public class MaquinaExpendedora {
	private int stock;
	private double precio;
	private Map<Integer, Integer> cambio;
	private Pantalla pantalla;
	private Ranura ranura;
	private int cantidadSolicitada;
	private int dineroIngresado;
	
	public MaquinaExpendedora(int stock, int precio, Pantalla pantalla, Ranura ranura) {
		this.stock=stock;
		this.precio=precio;
		this.cambio=new HashMap<>();
		this.pantalla=pantalla;
		this.ranura=ranura;
	}
	
	public void ingresarCantidad(int cant) {
		if (!this.hayStock(cant)) {
			this.pantalla.mostrar("No hay stock");
			this.ranura.cerrar();
		}
		else {
			this.ranura.abrir();
			this.pantalla.mostrar("Ingrese" + this.precioTotal() + "pesos");
			this.cantidadSolicitada=cant;
		}
	}

	public void ingresarDinero(int dinero) {
		this.dineroIngresado += dinero;
		if(this.cantidadSolicitada == 0) {
			this.dineroIngresado += dinero;
			if(this.llego()) {
				this.ranura.cerrar();
				this.entregarBotellasYVuelto();
			}
		}
	}
	
	private void entregarBotellasYVuelto() {
		if(this.hayVuelto(this.valorVuelto())) {
			this.stock -= this.cantidadSolicitada;
		}
		this.cantidadSolicitada=0;
		this.dineroIngresado=0;
	}

	private boolean hayVuelto(int valorVuelto) {
		return true;
	}

	private int valorVuelto() {
		return this.dineroIngresado - this.precioTotal());
	}

	private int precioTotal() {
		return (int) (this.cantidadSolicitada * this.precio);
	}

	private boolean hayStock(int cant) {
		return this.stock >= cant;
	}
}
