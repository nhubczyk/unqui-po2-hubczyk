package ar.edu.unq.po2.tp5;

public class Impuesto implements Agencia {
	private int tasa;

	public Impuesto(int tasa) {
		this.setTasa(tasa);
	}
	
	public int getTasa() {
		return tasa;
	}

	public void setTasa(int tasa) {
		this.tasa = tasa;
	}
	
	public int montoAPagar() {
		return this.getTasa();
	}
	
	public void registrarPago(Impuesto imp) {
		System.out.println("El pago a realizar es:" + imp.montoAPagar());
	}
}
