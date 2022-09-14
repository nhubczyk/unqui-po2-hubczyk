package ar.edu.unq.po2.tp4;

public class Producto {
	private String nombreDelProducto;
	protected Double precio;
	private Boolean esParteDePreciosCuidados;
	
	public Producto(String nom, Double precio, Boolean esPrecioCuidado) {
		this.setNombreDelProducto(nom);
		this.precio=this.descuentoDelProducto(precio);
		this.setEsParteDePreciosCuidados(esPrecioCuidado);
	}
	
	public Producto(String nom, Double precio) {
		this.setNombreDelProducto(nom);
		this.precio=this.descuentoDelProducto(precio);
	}
	
	public String getNombreDelProducto() {
		return this.nombreDelProducto;
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

	public Boolean getEsParteDePreciosCuidados() {
		return esParteDePreciosCuidados;
	}

	public void setEsParteDePreciosCuidados(Boolean esParteDePreciosCuidados) {
		this.esParteDePreciosCuidados = esParteDePreciosCuidados;
	}

	public Double getPrecio() {
		return this.precio;
	}	

}
