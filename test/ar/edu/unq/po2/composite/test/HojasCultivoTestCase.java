package ar.edu.unq.po2.composite.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.composite.Soja;
import ar.edu.unq.po2.composite.Trigo;

class HojasCultivoTestCase {
	private Soja soja;
	private Trigo trigo;
	
	@BeforeEach
	public void setUp() {
		soja = new Soja();
		trigo = new Trigo();
	}
	
	@Test
	void testGetGananciaAnualSoja() {
		assertEquals(500, soja.getGananciaAnual());
	}
	
	@Test
	void testGetGananciaAnualTrigo() {
		assertEquals(300, trigo.getGananciaAnual());
	}

}
