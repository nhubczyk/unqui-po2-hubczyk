package ar.edu.unq.po2.tp5;

public class Caja {
	
	public Double registrar(Costeable costo) {
		return costo.getPrecio();
	}
	
	public Double montoAPagar(Costeable costo) {
		var monto = 0.00;
		if (costo.getStock() > 0) {
			monto = monto + this.registrar(costo);
		}
		return monto;
	}
}