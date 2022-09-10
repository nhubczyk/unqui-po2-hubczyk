package ar.edu.unq.po2.tp4;

public class Producto {
	private String nombreDelProducto;
	private Double precio;
	private Boolean esParteDePreciosCuidados;
	
	public void setNombreDelProducto(String nombreDelProducto) {
		this.nombreDelProducto = nombreDelProducto;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}
			
}
