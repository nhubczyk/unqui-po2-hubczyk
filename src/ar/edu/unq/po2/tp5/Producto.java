package ar.edu.unq.po2.tp5;

public class Producto implements Costeable {
	protected double precio;
	protected int stock;
	
	public Producto(double precio, int stock) {
		this.precio=precio;
		this.stock=stock;
	}
	
	@Override
	public void cobrar() {
		// TODO Auto-generated method stub
		
	}

	public Double getPrecio() {
		return precio;
	}

	public int getStock() {
		return stock;
	}
	
}
