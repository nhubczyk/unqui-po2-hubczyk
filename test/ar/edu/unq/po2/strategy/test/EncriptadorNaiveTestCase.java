package ar.edu.unq.po2.strategy.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.strategy.EncriptadorNaive;

class EncriptadorNaiveTestCase {
	private EncriptadorNaive encriptador;
	
	@BeforeEach
	public void setUp() {
		encriptador = new EncriptadorNaive();
	}
	
	@Test
	void testEncriptar() {
		assertEquals("Nicalas", encriptador.encriptar("Nicolas"));
	}

}
