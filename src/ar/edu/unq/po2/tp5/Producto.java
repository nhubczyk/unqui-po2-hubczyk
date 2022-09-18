package ar.edu.unq.po2.tp5;

public class Producto implements Costeable {
	protected Float precio;
	private int stock;
	
	public Producto(Float precio, int stock) {
		this.setPrecio(precio);
		this.setStock(stock);
	}
	
	public Float getPrecio() {
		return precio;
	}
	
	public void setPrecio(Float precio) {
		this.precio = precio;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	public Float montoAPagar(Producto prod) {
		var suma = 0.00f;
		suma = this.getPrecio() + prod.getPrecio();
		stock = stock - 1;
		return suma;
	}
	
}
