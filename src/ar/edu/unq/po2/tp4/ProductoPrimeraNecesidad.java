package ar.edu.unq.po2.tp4;

public class ProductoPrimeraNecesidad extends Producto{

	@Override
	public Double descuentoDeProducto() {
		return 0.10;
	}

	@Override
	public Double getPrecio() {
		this.precio * this.descuentoDeProducto();
	}

}
