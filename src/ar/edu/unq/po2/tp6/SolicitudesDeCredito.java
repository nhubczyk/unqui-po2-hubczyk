package ar.edu.unq.po2.tp6;

public abstract  class SolicitudesDeCredito {
	protected Float montoSolicitado;
	protected int plazoEnMeses;
	protected Float montoCuota;
	
	public abstract  Boolean sonAceptables();

	public Float getMontoSolicitado() {
		return montoSolicitado;
	}

	public void setMontoSolicitado(Float montoSolicitado) {
		this.montoSolicitado = montoSolicitado;
	}
	
	public Float getMontoCuota() {
		return montoCuota;
	}
}
