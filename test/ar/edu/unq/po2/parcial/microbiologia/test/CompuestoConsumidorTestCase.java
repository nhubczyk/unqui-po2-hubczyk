package ar.edu.unq.po2.parcial.microbiologia.test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.parcial.microbiologia.Consumidor;
import ar.edu.unq.po2.parcial.microbiologia.Poblacion;

class CompuestoConsumidorTestCase {
	private Poblacion poblacion;
	private Consumidor consumidor;
	
	@BeforeEach
	public void SetUp() {
		poblacion = new Poblacion(5);
		consumidor = mock(Consumidor.class);
		
		when(consumidor.consumoDeOxigeno()).thenReturn(20.4);
	}
	
	@Test
	void testAddConsumidor() {
		poblacion.addConsumidor(consumidor);
		assertEquals(1, poblacion.getConsumidores().size());
	}
	
	@Test
	void testConsumoDeOxigeno() {
		poblacion.addConsumidor(consumidor);
		assertEquals(4.08, poblacion.consumoDeOxigeno());
	}

}
