package ar.edu.unq.po2.tp6;

public class CreditosPersonales extends SolicitudesDeCredito {
	private Cliente solicitante;
	
	public CreditosPersonales(float montoSoli, int plazo, float montoCuota) {
		this.montoSolicitado=montoSoli;
		this.plazoEnMeses=plazo;
		this.montoCuota=montoCuota;
	}

	@Override
	public Boolean sonAceptables() {
		return this.tieneSuficientesIngresosAnuales() && this.montoDeLaCuotaMenorAl70PorCiento();
	}

	public Boolean tieneSuficientesIngresosAnuales() {
		return solicitante.getSueldoNetoAnual() >= 15000;
	}

	public Boolean montoDeLaCuotaMenorAl70PorCiento() {
		return this.getMontoCuota() <= 70;
	}
	
	

}
