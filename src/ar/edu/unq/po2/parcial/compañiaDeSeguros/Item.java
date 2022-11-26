package ar.edu.unq.po2.parcial.compañiaDeSeguros;

public class Item {
	private int cantidad;
	private double precio;
	
	public Item(int cant, double precio) {
		this.cantidad=cant;
		this.precio=precio;
	}
	
	public double valorDeUnItem() {
		return this.getCantidad() * this.getPrecio();
	}

	public double getPrecio() {
		return precio;
	}

	public int getCantidad() {
		return cantidad;
	}
}
