import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.Month;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.Persona;

class PersonaTestCase {
	private Persona persona;
	private Persona persona2;
	
	@BeforeEach
	public void setUp() throws Exception {
		persona = new Persona("Nicolas", LocalDate.of(1993, Month.MARCH, 12));
		persona2 = new Persona("Sofia", LocalDate.of(1997, Month.AUGUST, 3));
	}
	
	@Test
	void testEdadDeLaPersona() {
		int edad = persona.edadDeLaPersona();
		assertEquals(edad, 29);
	}
	
	@Test
	void testMenorQue() {
		assertTrue(persona2.menorQue(persona));
	}

}
