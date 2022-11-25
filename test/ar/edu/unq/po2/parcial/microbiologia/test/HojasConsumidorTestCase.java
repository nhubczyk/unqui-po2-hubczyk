package ar.edu.unq.po2.parcial.microbiologia.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.parcial.microbiologia.Bacilos;
import ar.edu.unq.po2.parcial.microbiologia.Cocos;
import ar.edu.unq.po2.parcial.microbiologia.Poblacion;

class HojasConsumidorTestCase {
	private Poblacion poblacion;
	private Cocos cocos;
	private Bacilos bacilos;
	
	@BeforeEach
	public void SetUp() {
		poblacion = new Poblacion(10);
		cocos = new Cocos(10.5, 2);
		bacilos = new Bacilos(5.7, 3);
		
		poblacion.addConsumidor(bacilos);
		poblacion.addConsumidor(cocos);
	}
	
	@Test
	void testConsumoDeOxigenoDeUnaPoblacion() {
		assertEquals(7.62, poblacion.consumoDeOxigeno());
	}
	
	@Test
	void testConsumoDeOxigenoDeUnCoco() {
		assertEquals(21.0, cocos.consumoDeOxigeno());
	}
	
	@Test
	void testConsumoDeOxigenoDeUnBacilo() {
		assertEquals(17.1, bacilos.consumoDeOxigeno());
	}
}
