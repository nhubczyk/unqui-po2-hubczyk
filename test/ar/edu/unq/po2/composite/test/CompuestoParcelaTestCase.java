package ar.edu.unq.po2.composite.test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.composite.Cultivo;
import ar.edu.unq.po2.composite.Parcela;

class CompuestoParcelaTestCase {
	private Parcela parcela; // SUT
	private Cultivo cultivo1; // DOC
	private Cultivo cultivo2; // DOC
	
	@BeforeEach
	public void setUp() {
		parcela = new Parcela();
		
		cultivo1 = mock(Cultivo.class);
		cultivo2 = mock(Cultivo.class);
		
		when(cultivo1.getGananciaAnual()).thenReturn(125);
		when(cultivo2.getGananciaAnual()).thenReturn(200);
	}

	@Test
	void testAddCultivo() {
		parcela.addCultivo(cultivo1);
		assertEquals(1, parcela.getCultivos().size());
	}
	
	@Test
	void testSumaDeGanancias() {
		parcela.addCultivo(cultivo1);
		parcela.addCultivo(cultivo1);
		
		assertEquals(250, parcela.getGananciaAnual());
	}
	
	@Test
	void testSumaDeGananciasDeDosCultivos() {
		parcela.addCultivo(cultivo1);
		parcela.addCultivo(cultivo2);
		
		assertEquals(325, parcela.getGananciaAnual());
	}

}
