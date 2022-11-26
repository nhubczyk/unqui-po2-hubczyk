package ar.edu.unq.po2.parcial.compañiaDeSeguros;

public class GastosAdministrativos {
	private String concepto;
	private double monto;
	
	public GastosAdministrativos(String concepto, double monto) {
		this.concepto=concepto;
		this.monto=monto;
	}

	public double getMonto() {
		return monto;
	}
	
	
}
