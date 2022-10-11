import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp6.CreditosHipotecarios;
import ar.edu.unq.po2.tp6.CreditosPersonales;

class SolicitudesDeCreditoTestCase {
	private CreditosPersonales creditosPersonales;
	private CreditosHipotecarios creditosHipotecarios;
	
	public void SetUp() throws Exception {
		creditosPersonales = new CreditosPersonales(100.000f, 4, 20.000f);
	}
	
	@Test
	void testSonAceptables() {
		assertTrue(creditosPersonales.sonAceptables());
	}

	@Test
	public void testSuficientesIngresosAnuales() {
		assertTrue(creditosPersonales.tieneSuficientesIngresosAnuales());
	}
	
	@Test
	public void testMontoMenosAl70PorCiento() {
		assertTrue(creditosPersonales.montoDeLaCuotaMenorAl70PorCiento());
	}
}
