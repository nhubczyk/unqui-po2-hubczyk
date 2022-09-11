package ar.edu.unq.po2.tp4;

public abstract class Producto {
	private String nombreDelProducto;
	protected Double precio;
	private Boolean esParteDePreciosCuidados;
	
	public abstract Double descuentoDeProducto();
	
	public void setNombreDelProducto(String nombreDelProducto) {
		this.nombreDelProducto = nombreDelProducto;
	}

	public abstract Double getPrecio();

	public void setPrecio(Double precio) {
		this.precio = precio;
	}
}
