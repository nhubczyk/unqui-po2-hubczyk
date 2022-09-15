import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp5.Agenda;

public class AgendaTestCase {
	private Agenda agenda;
	
	@BeforeEach
	public void setUp() {
		agenda = new Agenda();
		agenda.agregarNombre("nicolas y racing");
	}
	
	@Test
	public void testAnyMatch() {
		assertTrue(agenda.anyMatch("n"));
	}
	
	@Test
	public void testAllMatch() {
		assertTrue(agenda.allMatch("a"));
	}
}
