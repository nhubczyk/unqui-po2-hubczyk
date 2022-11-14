package ar.edu.unq.po2.tp5;

public class ProductoCooperativa extends Producto {
	
	public ProductoCooperativa(double precio, int stock) {
		super(precio, stock);
	}
	
	@Override
	public Double getPrecio() {
		return super.getPrecio() * this.descuento();
	}
	
	public Double descuento() {
		return 0.10;
	}
	
	
}
