package ar.edu.unq.po2.tp5;

public class Producto implements Registro {
	protected Float precio;
	private int stock;
	
	public Producto(Float precio, int stock) {
		this.setPrecio(precio);
		this.setStock(stock);
	}
	
	public Float descuento() {
		return this.precio * 0.10f;
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
	
	public Float montoAPagar() {
		return this.getPrecio();
	}
	
	public void actualizarStock() {
		this.stock=this.stock -1;
	}
}
