package supermercado;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp4.Producto;

import static org.junit.jupiter.api.Assertions.*;

public class ProductoTest {
	
	private Producto arroz;
	private Producto vino;
	
	@BeforeEach
	public void setUp() {
		arroz = new Producto("Arroz", 18.9d, true);
		vino = new Producto("Vino", 55d);
	}
	
	@Test
	public void testConstructor() {
		assertEquals("Arroz", arroz.getNombreDelProducto());
		assertEquals(new Double(18.9), arroz.getPrecio());
		assertTrue(arroz.getEsParteDePreciosCuidados());
		
		assertEquals("Vino", vino.getNombreDelProducto());
		assertEquals(new Double(55), vino.getPrecio());
		assertFalse(vino.getEsParteDePreciosCuidados());
	}
	
	@Test
	public void testAumentarPrecio() {
		arroz.aumentarPrecio(1.5);
		assertEquals(new Double(20.4), arroz.getPrecio());
	}
}
