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
		poblacion = new Poblacion();
		consumidor = mock(Consumidor.class);
	}
	
	@Test
	void test() {
		fail("Not yet implemented");
	}

}
