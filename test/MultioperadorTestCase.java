import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.Multioperador;

class MultioperadorTestCase {
	private Multioperador operador;
	
	/*
	 * Se crea un escenario de Test basicos. 
	 * 
	*/
	@BeforeEach
	public void setUp() throws Exception {
		//Se crea el multioperador
		operador = new Multioperador();
	
		//Se agregan los numeros.
		operador.addNumber(5);
		operador.addNumber(10);
		operador.addNumber(2);
		operador.addNumber(4);
		operador.addNumber(1);
	}
	
	/**
	* Verifica la suma
	*/
	@Test
	public void sumaDeEnteros() {
		int enteros = operador.sumaDeEnteros();
		assertEquals(enteros, 22);
	}
	
	/**
	* Verifica la resta.
	*/
	@Test
	public void restaDeEnteros() {
		int resta = operador.restaDeEnteros();
		assertEquals(resta, -12);
	}

	/**
	* Verifica la multiplicacion.
	*/
	@Test
	public void multiplicacionDeEnteros() {
		int enteros = operador.multiplicacionDeEnteros();
		assertEquals(enteros, 400);
	}
}
