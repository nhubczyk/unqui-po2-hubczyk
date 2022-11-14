package ar.edu.unq.po2.tp4;

public class ProductoPrimeraNecesidad extends Producto{
	
	public ProductoPrimeraNecesidad(String nom, Double precio, Boolean esPrecioCuidado) {
		super(nom, precio, esPrecioCuidado);
	}
	
	public Double descuentoDeProducto(Double descuento) {
		return descuento;
	}

	public Double getPrecio(Double descuento) {
		return super.precio * this.descuentoDeProducto(descuento);
	}

}