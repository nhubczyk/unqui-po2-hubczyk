
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp5.Agenda;

public class AgendaTestCase {
	private Agenda agenda;
	
	@BeforeEach
	public void setUp() {
		agenda = new Agenda();
		agenda.agregarNombre("nicolas");
		agenda.agregarNombre("lucia");
	}
	
	@Test
	public void testAnyMatch() {
		assertTrue(agenda.anyMatch("n"));
	}
	
	@Test
	public void testAllMatch() {
		assertTrue(agenda.allMatch("a"));
	}
	
	@Test
	
	public void testFilter() {
		List<String> lista;
		lista = new ArrayList<String>();
		lista.add("lucia");
		assertEquals(agenda.filter("l"), lista);
	}
}
