package ar.edu.unq.po2.tp4;

public class Producto {
	private String nombreDelProducto;
	protected Double precio;
	private Boolean esParteDePreciosCuidados;
	
	public Producto(String nom, Double precio, Boolean esPrecioCuidado) {
		this.setNombreDelProducto(nom);
		this.precio=this.descuentoDelProducto(precio);
		this.esParteDePreciosCuidados=esPrecioCuidado;
	}
	
	public void setNombreDelProducto(String nombreDelProducto) {
		this.nombreDelProducto = nombreDelProducto;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	
	public Double descuentoDelProducto(Double precio) {
		return precio * 0.10;
	}	

}
