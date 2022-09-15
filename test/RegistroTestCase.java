import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp5.Producto;
import ar.edu.unq.po2.tp5.ProductoCooperativa;
import ar.edu.unq.po2.tp5.Registro;

class RegistroTestCase {

	private Registro fideos;
	private Registro leche;
	
	@BeforeEach
	public void setUp() {
		fideos = new Producto(5.20f, 10);
		leche = new ProductoCooperativa(6.10f, 5);
	}
	
	@Test
	public void testMontoAPagar() {
		assertEquals(5.2f, fideos.montoAPagar());
		assertEquals(6.1f, leche.montoAPagar());
	}
	
	@Test
	public void testDescuento() {
		assertEquals(0.61f, leche.descuento());
	}

}
