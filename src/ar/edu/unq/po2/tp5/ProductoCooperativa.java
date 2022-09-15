package ar.edu.unq.po2.tp5;

public class ProductoCooperativa extends Producto {
	
	public ProductoCooperativa(Float precio, int stock) {
		super(precio, stock);
	}

	public Float descuento() {
		return super.precio * 0.10f;
	}
}
